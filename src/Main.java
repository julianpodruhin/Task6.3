public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Truck truck = new Truck(3900, "HOWO T5G", 'G', 90.0F, 6, 2500.0);
        truck.outPut();
        truck.newWheels(8);
        Car car = new Car(1200, "Жигули", 'Y', 130.0F);
        car.outPut();
    }
}
