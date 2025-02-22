package temp;

public class Calculate {

    static int n;

    public static void main(String[] args) {

        int result = Calculate.cube(5);

        System.out.println(result);             // 125

        System.out.println("n from main method:" + n);

    }

    private static int cube(int x) {            //Static method
        return x * x * x;
    }

    static {
        System.out.print("n from static block: ");
        n = 10;
    }
}