public class CardPaymentService implements IPaymentService {
    @Override
    public String pay(Payment p) {
        return "Paid via Card: " + p.amount;
    }
}
