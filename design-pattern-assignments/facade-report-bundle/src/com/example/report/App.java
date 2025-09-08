package com.example.report;
import java.nio.file.*; import java.util.*;
// Make sure this import matches the actual package and class location
import com.example.report.ReportBundleFacade;

public class App {
    public static void main(String[] args) {
        Map<String,Object> data = Map.of("name", "Quarterly");
        ReportBundleFacade facade = new ReportBundleFacade();
        facade.export(data, Path.of("out"), "report");
    }
}
