public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment("EXPRESS", 2.0);
        IShippingCostCalculator calculator = new ExpressShippingCostCalculator(shipment);

        System.out.println(calculator.cost());
    }
}
