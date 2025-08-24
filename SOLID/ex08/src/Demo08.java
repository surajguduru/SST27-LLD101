public class Demo08 {
    public static void main(String[] args) {
        MotorVehicle mv = new MotorBike();
        mv.startEngine();
        mv.stopEngine();

        ElectricVehicle ev = new ElectricCar();
        ev.recharge(50);

        Bicycle v = new Bicycle();
        v.pedal(5);
    }
}
