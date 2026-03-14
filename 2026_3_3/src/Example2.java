public class Example2 {
    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.name = "小明";
        stu1.age = 12;
        stu1.sex = "男";
        stu2.name = "小红";
        stu2.age = 13;
        stu2.sex = "女";
        stu1.speak();
        stu2.speak();
    }
}
class Student{
    String name;
    int age;
    String sex;
    void speak (){
        System.out.println("大家好，我是" + name + "今年" + age + "岁了" + "我是" + sex + "孩");
    }
}