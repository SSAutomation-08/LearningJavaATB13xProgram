package Test_19June25;

public class Test7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("The largest number is: " + largest);

    }
}
