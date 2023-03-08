import java.util.Scanner;

public class Debug {

    public static int m(int x) {
        x++;
        x++;
        return x;
    }

    public static int f(int x) {
        return x + 1;
    }

    public static int g(int x) {
        return x + 2;
    }

    public static void myMethod() {
        System.out.println("myMethod likes to be executed.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 42; // variable to be observed	

        // Experiment 1:
        System.out.println(" --- Experiment 1: Playing with breakpoints ---");
        i = 12;
        i = 13;
        i = 14;

        // Experiment 2a:
        System.out.println(" --- Experiment 2a: Stepping through a program, Part 1 ---");
        i = m(42);
        i = i + 77;
        myMethod();
        i = i + 77;

        // Experiment 2b:
        System.out.println(" --- Experiment 2b: Stepping through a program, Part 2 ---");
        i = f(g(42));
        i = i + 77;

        // Experiment 3:
        System.out.println(" --- Experiment 3: Avoiding tedious debugging ---");
        int z = 42;
        for (i = 0; i < 5000; i++) {
            z = (z + i * 4) % 345;
        }
        System.out.println("z: " + z);
    }
}
