import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        do {
            System.out.println("Which animal do you want?");
            System.out.print("(1 = Cat) or (2 = Dog): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                animal = new Cat();
                animal.speak();
            } else if (choice == 2) {
                animal = new Dog();
                animal.speak();
            } else {
                animal = new Animal();
                System.out.println("Invalid input");
                animal.speak();
            }
        } while (true);
    }
}