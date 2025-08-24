public class OvernightShippingCostCalculator implements IShippingCostCalculator {
    Shipment s;

    public OvernightShippingCostCalculator(Shipment s) {
        this.s = s;
    }

    @Override
    public double cost() {
        return 120 + 10 * s.weightKg;
    }
}
