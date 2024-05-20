import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 밤고가 가진 100원짜리 갯수 : n, 초코바 가격: m
        // n > m 이면 살 수 있다. 살 수 있으면 yes 없으면 no를 출력해라

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (100 * n >= m) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}