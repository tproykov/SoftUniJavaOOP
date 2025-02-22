package temp;

public class Main1 {

    static int n;                                   //Static (class) variable

    static {                                        //Static block implemented before the main method
        System.out.println("From static block: " + n);
        n = 10;
    }

    public static void main(String[] args) {
        System.out.println("From main method: " + n);
    }
}