import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        Order o = new Order.OrderBuilder()
                .setId("o1")
                .setCustomerEmail("a@b.com")
                .addLine(l1)
                .addLine(l2)
                .setDiscountPercent(10)
                .setCustomerEmail("another@b.com")
                .build();

        System.out.println("Total before discount: " + o.totalBeforeDiscount());
        System.out.println("Total after discount: " + o.totalAfterDiscount());
        System.out.println("Customer email: " + o.getCustomerEmail());

        // System.out.println("Before: " + o.totalAfterDiscount());
        // l1.setQuantity(999); // demonstrates mutability leak
        // System.out.println("After:  " + o.totalAfterDiscount());
        // System.out.println("=> In the solution, totals remain stable due to defensive copies.");
    }
}
