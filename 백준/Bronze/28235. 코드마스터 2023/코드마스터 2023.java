import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 구호 SONGDO에 대해 HIGHSCHOOL로 응원.
        //구호 CODE에 대해 MASTER로 응원.
        //구호 2023에 대해 0611로 응원.
        //구호 ALGORITHM에 대해 CONTEST로 응원.

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        if (A.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (A.equals("CODE")) {
            System.out.println("MASTER");
        } else if (A.equals("2023")) {
            System.out.println("0611");
        } else {
            System.out.println("CONTEST");
        }
    }
}