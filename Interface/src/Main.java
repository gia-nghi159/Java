public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        fish.flee();
        fish.hunt();

        rabbit.flee();

        hawk.hunt();

    }
}