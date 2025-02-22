package temp;

public class Calculate {

    public static void main(String[] args) {

        int result = Calculate.cube(5);

        System.out.println(result);             // 125

    }

    private static int cube(int x) {            //Static method
        return x * x * x;
    }
}