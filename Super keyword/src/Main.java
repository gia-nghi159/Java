//SUPER:  keyword refers to parent class of a sub class (similar to "this" keyword)

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Bob",25,"$$$");
        Hero hero2 = new Hero("May",34,"everything");

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}