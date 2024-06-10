
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //테스트케이스

        for (int j = 0; j < n; j++) {//j=0부터 n까지 돌 동안 하나씩 증가한다.
            String s = sc.next();// 주어진 글자
            System.out.println(s.toLowerCase());//주어진 글자의 소문자로 바꿔라

        }
    }
}

