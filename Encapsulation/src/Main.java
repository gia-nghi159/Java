public class Main {
    public static void main(String[] args) {

        Car car = new Car("Chevrolet", "Camaro",2021);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        car.setYear(2023);
        System.out.println(car.getYear());


    }
}