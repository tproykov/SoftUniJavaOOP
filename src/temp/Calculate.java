package temp;

public class Calculate {

    static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {

        int result = Calculate.cube(5);

        System.out.println(result);             // 125
        System.out.println(Math.pow(2, 3));     // 8.0
    }
}