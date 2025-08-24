

public class Demo01 {
    public static void main(String[] args) {
        EmailClient email = new EmailClient(); 
        TaxCalculator taxCalculator = new TaxCalculator();
        IOrderRepository repository = new SQLRepository();
        new OrderService(taxCalculator, email, repository).checkout("a@shop.com", 100.0);
    }
}
