
public class Demo04 {
    public static void main(String[] args) {
        Payment payment = new Payment(new UPIPaymentService(), 999);
        System.out.println(payment.provider.pay(payment));
    }
}
