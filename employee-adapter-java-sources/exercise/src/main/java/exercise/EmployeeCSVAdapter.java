package exercise;

public class EmployeeCSVAdapter implements Employee {
    private final EmployeeCSV employeeCSV;
    
    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }
    
    @Override
    public String getId() {
        return employeeCSV.getCsvRow().split(",")[0];
    }
    
    @Override
    public String getFirstName() {
        return employeeCSV.getCsvRow().split(",")[1];
    }
    
    @Override
    public String getLastName() {
        return employeeCSV.getCsvRow().split(",")[2];
    }
    
    @Override
    public String getEmail() {
        return employeeCSV.getCsvRow().split(",")[3];
    }
}
