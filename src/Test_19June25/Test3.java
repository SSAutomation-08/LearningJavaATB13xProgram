package Test_19June25;

public class Test3 {
    public static void main(String[] args) {
        int i = 10;
        i = ++i; //11
        System.out.println("Value of i Pre-Increment = " + i);
        i = i++;
        i = i+i; //22
        System.out.println("Value of i Post increment = " + i);

    }
}
