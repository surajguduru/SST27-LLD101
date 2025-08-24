public class TaxCalculator {
    private double taxRate = 0.18;

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
