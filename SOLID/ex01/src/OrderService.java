public class OrderService {

    private TaxCalculator taxCalculator;
    private EmailClient email;
    private IOrderRepository repository;

    public OrderService(TaxCalculator taxCalculator, EmailClient email, IOrderRepository repository) {
        this.taxCalculator = taxCalculator;
        this.email = email;
        this.repository = repository;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        repository.storeOrder(customerEmail, total);
    }
}