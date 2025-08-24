public class ExpressShippingCostCalculator implements IShippingCostCalculator {
    Shipment s;

    public ExpressShippingCostCalculator(Shipment s) {
        this.s = s;
    }

    @Override
    public double cost() {
        return 80 + 8 * s.weightKg;
    }
}
