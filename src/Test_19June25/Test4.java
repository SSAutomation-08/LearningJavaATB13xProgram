package Test_19June25;

public class Test4 {
    public static void main(String[] args) {
        int i = 10;
        long j = i;

        int i2 = 1000;
        byte b = (byte) i2;

        System.out.println("Implicit widening" +j);
        System.out.println("Explicit narrowing" + b);
    }
}
