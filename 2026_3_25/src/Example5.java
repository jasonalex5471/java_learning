import java.util.Calendar;

public class Example5 {
    public static void main(String[] args){
        Calendar ca = Calendar.getInstance();
        int year = ca.get(Calendar.YEAR);
        int month = ca.get(Calendar.MONTH) + 1;
        int date = ca.get(Calendar.DATE);
        int hour = ca.get(Calendar.HOUR);
        int minute = ca.get(Calendar.MINUTE);
        int second = ca.get(Calendar.SECOND);

        System.out.print("当前时间为：" + year);
        System.out.print(month);
        System.out.print(date);
        System.out.print(hour);
        System.out.print(minute);
        System.out.println(second);

        Calendar ca1 = Calendar.getInstance();
        ca1.set(2021,0,1);
        ca1.add(Calendar.MONTH, 1);
        int year1 = ca1.get(Calendar.YEAR);
        int month1 = ca1.get(Calendar.MONTH) + 1;
        int date1 = ca1.get(Calendar.DATE);
        System.out.println("修改后的时间：" + year1);
        System.out.println(month1);
        System.out.println(date1);
        System.out.println(year1);
    }
}
