public class Demo10 {
    public static void main(String[] args) {
        IConsoleLogger logger = new ConsoleLogger();
        new ReportService(logger).generate();
    }
}
