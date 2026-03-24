public class Example2 {
    public static void main(String[] args){
        String str = "abcd";
        System.out.println("将字符串转换为字符数组");
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if(i != charArray.length - 1){
                System.out.print(charArray[i] + ",");
            }
            else{
                System.out.println(charArray[i]);
            }
        }
        System.out.println("将int值转换为String的值" + String.valueOf(12));
        System.out.println("将字符串转换为大写之后的结果" + str.toUpperCase());
        System.out.println("将字符串转换为小写之后的结果" + str.toLowerCase());
    }
}