public class WalletPaymentService implements IPaymentService {
    @Override
    public String pay(Payment p) {
        return "Wallet debit: " + p.amount;
    }
}
