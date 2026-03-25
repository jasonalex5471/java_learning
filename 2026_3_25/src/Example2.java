import java.math.BigInteger;

public class Example2 {
    public static void main(String[] args){
        BigInteger bi1 = new BigInteger("123456789");
        BigInteger bi2 = new BigInteger("987654321");
        System.out.println("add:" + bi2.add(bi1));
        System.out.println("subtract:" + bi2.subtract(bi1));
        System.out.println("mutiply:" + bi2.multiply(bi1));
        System.out.println("divide:" + bi2.divide(bi1));
        System.out.println("max:" + bi2.max(bi1));
        System.out.println("min:" + bi2.min(bi1));
        BigInteger[] result = bi2.divideAndRemainder(bi1);
        System.out.println("bi2 divide bi1 商：" + result[0] + " 余数 " + result[1]);
    }
}
