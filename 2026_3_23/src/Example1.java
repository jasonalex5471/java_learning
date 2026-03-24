public class Example1 {
    public static void main(String[] args){
        String s = "ababcdedcba";

        System.out.println("字符串的长度" + s.length());
        System.out.println("字符串的第一个字符" + s.charAt(0));
        System.out.println("字符c的第一次出现位置" + s.indexOf('c'));
        System.out.println("字符c的最后一次出现的位置" + s.lastIndexOf('c'));
        System.out.println("子字符串ab第一次出现的位置" + s.indexOf("ab"));
        System.out.println("子字符串ab最后一次出现的位置" + s.lastIndexOf("ab"));
    }
}