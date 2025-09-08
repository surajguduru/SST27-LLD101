package beverages_decorator;

public class CaramelDecorator implements Beverage {
    private Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 30;
    }
    
}
