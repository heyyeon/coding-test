import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 주사위 3개 던진다.
        //2. 같은 눈 3개 나오면 10,000 + 눈 * 1,000 상금
        //3. 같은 눈 2개 : 1,000 + 눈 * 100
        //4. 모두 다른 눈 : 가장 큰 눈 * 100

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a == c) { //모두 같을 경우
            System.out.println(10000 + a * 1000);
        } else if (a == b) { // 2개만 같을 경우
            System.out.println(1000 + a * 100);
        } else if ( a == c ) {
            System.out.println(1000 + a * 100);
        } else if ( b == c ) {
            System.out.println(1000 + b * 100);
    } else { // 전부 다를 경우
            int total = 0;
            if (a > b) {
                total = a;
            } else {
                total = b;
            }
            if (total < c) {
                total = c;
            }
            System.out.println(total * 100);
        }
    }
}