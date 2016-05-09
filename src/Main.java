import com.one.HttpRequest;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String s= HttpRequest.sendGet("http://www.baidu.com", "");
        System.out.println(s);
    }
}
