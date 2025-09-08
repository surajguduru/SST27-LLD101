package com.example.report;
import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    JsonWriter jw = new JsonWriter(); 
    Zipper z = new Zipper(); 
    AuditLog log = new AuditLog();

    public void export(Map<String,Object> data, Path outDir, String baseName) {
        Path json = jw.write(data, outDir, baseName);
        Path zip = z.zip(json, outDir.resolve(baseName + ".zip"));
        log.log("exported " + zip);
        System.out.println("DONE " + zip);
    }
}
