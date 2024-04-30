import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //테스트케이스

        for (int i = 0; i < t ; i++) {
            String s = sc.next();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
        }
        
    }
}