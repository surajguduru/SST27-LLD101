public class Demo07 {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello");

        Scanner scanner = new BasicScanner();
        scanner.scan("/tmp/out");
    }
}
