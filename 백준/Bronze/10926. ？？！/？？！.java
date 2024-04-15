
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //단어일 때는 next, 문장일 때 nextLine
        String b = a + "??!";
        
        System.out.println(b);
    }
}
