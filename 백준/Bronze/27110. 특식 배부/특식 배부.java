
import java.io.IOException;
import java.util.Scanner;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 주문한 각 종류의 치킨마리수=N
        //2. 후리이드 치킨:A, 간장치킨:B, 양념치킨:C를 받는다.
        //3. 치킨을 받을 수 있는 인원수의 최댓값을 구해라.
        // 각 종류의 치킨마리수와 선호하는 인원을 비교해야함.

        int N = sc.nextInt();

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int A1 = Math.min(A,N);
        int B1 = Math.min(B,N);
        int C1 = Math.min(C,N);

        int total = A1+B1+C1;

        System.out.println(total);


    }
}