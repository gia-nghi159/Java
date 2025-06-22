//OVERLOADED METHODS: methods that share the same name but have different parameters

public class Main {
    public static void main(String[] args) {

        System.out.println(add(1,3,4));
        System.out.println(add(3.2,5));
    }

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }

    static double add(double a, int b){
        System.out.println("This is overloaded method #4");
        return a+b;
    }
}