import java.util.Random;

public class Example1 {
    public static void main(String[] args){
        Random r = new Random();
        System.out.println("boolean:" + r.nextBoolean());
        System.out.println("float:" + r.nextFloat());
        System.out.println("double:" + r.nextDouble());
        System.out.println("int:" + r.nextInt());
        System.out.println("int(0 ~ 100):" + r.nextInt(100));
        System.out.println("long:" + r.nextLong());
    }
}
