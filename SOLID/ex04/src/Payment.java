public class Payment {
    IPaymentService provider; 
    double amount;

    Payment(IPaymentService p, double a){ 
        provider=p;
        amount=a;
    }
}