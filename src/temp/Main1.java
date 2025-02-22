package temp;

public class Main1 {

    static int n;

    public static void main(String[] args) {
        System.out.println("From main method: ");
        System.out.println(n);
    }

    static {
        System.out.println("From static block: ");
        n = 10;
    }
}