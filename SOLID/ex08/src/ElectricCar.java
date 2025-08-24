public class ElectricCar implements MotorVehicle, ElectricVehicle {
    public void startEngine() {
        System.out.println("Electric car engine started");
    }

    public void stopEngine() {
        System.out.println("Electric car engine stopped");
    }

    public void recharge(int kWh) {
        System.out.println("Recharging electric car with " + kWh + " kWh");
    }
}
