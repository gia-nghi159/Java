//STATIC: a single copy of method/variable is created and shared
//        Every object/instance of the class share that single static copy.

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Sandy");
        Friend friend3 = new Friend("Patrick");
        Friend friend4 = new Friend("Squidward");

        Friend.displayNumberOfFriends();
        //When calling a static variable/method, better call with class name, not object name
    }
}