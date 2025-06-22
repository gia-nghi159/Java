//CONSTRUCTOR: a special method that is called when an object is instantiated (created)
//PASSING OBJECTS ~ School class

public class Main {
    public static void main(String[] args) {

         Human human1 = new Human("Ricky",20,60);
         Human human2 = new Human("Morty", 17,50);
         human1.eat();
         human2.drink();

         School school = new School();
         school.school(human1.name, "A");
         school.school(human2.name, "B");

    }
}