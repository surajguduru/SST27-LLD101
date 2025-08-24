public class StandardShippingCostCalculator implements IShippingCostCalculator {
    Shipment s;

    public StandardShippingCostCalculator(Shipment s) {
        this.s = s;
    }

    @Override
    public double cost() {
        return 50 + 5 * s.weightKg;
    }
}
