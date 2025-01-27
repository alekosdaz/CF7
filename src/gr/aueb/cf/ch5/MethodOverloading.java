package gr.aueb.cf.ch5;

public class MethodOverloading {

    public static void main(String[] args) {

        add(1,2);
        add(56l, 456l);
        add(45l, 5);
        add(5, 45l);
        add(1,2, 7);

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, long b){
        return a + (int) b;
    }

    public static int add(long a, int b){
        return (int) a + b;
    }

    public static long add(long a, long b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }
}
