public class SQLRepository implements IOrderRepository{

    @Override
    public void storeOrder(String email, double total) {
        System.out.println("Storing order for: " + email + " with total: " + total);
        System.out.println("Order stored in SQL DB (pretend).");
    }
}
