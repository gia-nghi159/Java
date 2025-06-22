//OBJECT: an instance of a class that may contain attributes and methods
/* attributes of a coffee cup:
        String color = "white";
        int temp = 20;
        boolean empty = true;
    methods of a coffee cup:
        drink(){
            System.out.println("You drank the coffee.");}
        spill(){
            System.out.println("You spilled the coffee.");}
 */

//toString(): a special method that returns a string that "textually represents" an object

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        myCar.drive();
        myCar.brake();
        System.out.println(myCar);
    }
}