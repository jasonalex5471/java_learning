import java.io.IOException;
public class Example5 {
    public static void main(String[] args) throws IOException{
        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe");
    }
}
