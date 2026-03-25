import java.math.BigDecimal;

public class Example3 {
    public static void main(String[] args){
        BigDecimal bd1 = new BigDecimal("0.001");
        BigDecimal bd2 = BigDecimal.valueOf(0.009);
        System.out.println(bd2.add(bd1));
        System.out.println(bd2.subtract(bd1));
        System.out.println(bd2.multiply(bd1));
        System.out.println(bd2.divide(bd1));
        System.out.println(bd2.max(bd1));
        System.out.println(bd2.min(bd1));
    }
}
