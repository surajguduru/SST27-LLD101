public class UPIPaymentService implements IPaymentService {
    @Override
    public String pay(Payment p) {
        return "Paid via UPI: " + p.amount;
    }
}