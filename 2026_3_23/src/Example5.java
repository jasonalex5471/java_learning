public class Example5 {
    public static void main(String[] args){
        String str ="石家庄-武汉-哈尔滨";

        System.out.println("从第5个字符截取到末尾的结果：" + str.substring(4));
        System.out.println("从第5个字符截取到第6个字符的结果" + str.substring(4,6));
        //分割操作
        String[] strArray = str.split("-");
        for (int i = 0; i < strArray.length; i++){
            if(i != strArray.length - 1){
                System.out.print(strArray[i] + ",");
            }
            else{
                System.out.println(strArray[i]);
            }
        }
    }
}
