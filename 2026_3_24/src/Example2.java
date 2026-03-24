public class Example2 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 1000000000; i++){
            sum += 1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间是：" + (endTime - startTime) + "ms");
    }
}
