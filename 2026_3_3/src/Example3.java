public class Example3 {
    public static void main(){
        Student1 stu1 = new Student1();
        Student1 stu2 = null;
        stu2 = stu1;
        stu1.name = "小明";
        stu1.age = 15;
        stu2.age = 18;
        stu1.read();
        stu2.read();
    }
}

class Student1{
    String name;
    int age;
    void read(){
        System.out.println("大家好，我是" + name + "年龄" + age);
    }
}