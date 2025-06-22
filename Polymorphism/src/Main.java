//POLYMORPHISM: an ability of an object to identify as more than one type

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat};

        for(Vehicle x: racers){
            x.go();
        }
    }
}