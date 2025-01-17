public class BicycleDemo {

    public static void main(String[] args) {

        // Create two different
        // bicycle objects
        ACMEBicycle bike1 = new ACMEBicycle();
        ACMEBicycle bike2 = new ACMEBicycle();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printState();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printState();
    }
}
