import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 단어 s 주어진다.
        //2. 정수 i가 주어진다.

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int i = sc.nextInt();

        System.out.println(S.charAt(i-1));

    }
}