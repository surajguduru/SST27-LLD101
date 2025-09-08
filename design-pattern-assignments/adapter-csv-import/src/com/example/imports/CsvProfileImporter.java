package com.example.imports;
import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter{
    private final NaiveCsvReader reader;
    private final ProfileService service;

    // Adapter class for NaiveCsvReader
    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = reader;
        this.service = service;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = reader.read(csvFile);
        int count = 0;

        // Validations and creating profiles
        for (String[] row : rows) {
            if(row.length >= 3) {
                String id = row[0].trim();
                String email = row[1].trim();
                String displayName = row[2].trim();
                try {
                    service.createProfile(id, email, displayName);
                    count++;
                } catch (Exception e) {
                    System.err.println("Failed to create profile for row: " + String.join(",", row) + " - " + e.getMessage());
                }
            } else {
                System.err.println("Invalid row (expected at least 3 columns): " + String.join(",", row));
            }
        }

        return count;
    }

}
