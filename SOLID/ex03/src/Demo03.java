public class Demo03 {
    
    static public IShippingCostCalculator getShippingCalculator(Shipment shipment) {
        if(shipment.type.equals("OVERNIGHT")) {
            return new OvernightShippingCostCalculator(shipment);
        }
        else if(shipment.type.equals("EXPRESS")) {
            return new ExpressShippingCostCalculator(shipment);
        }
        else if(shipment.type.equals("STANDARD")) {
            return new StandardShippingCostCalculator(shipment);
        }
        throw new IllegalArgumentException("Unknown shipping type");
    }

    public static void main(String[] args) {
        Shipment shipment = new Shipment("EXPRESS", 2.0);
        IShippingCostCalculator calculator = getShippingCalculator(shipment);

        System.out.println(calculator.cost());
    }
}
