import java.util.Date;

public class Example4 {
    public static void main(String[] args){
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() + 1000);
        System.out.println(date1);
        System.out.println(date2);
    }
}
