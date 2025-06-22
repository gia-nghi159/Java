public class Friend {

    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayNumberOfFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
