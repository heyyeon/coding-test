
import java.io.IOException;
import java.util.Scanner;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        //1. test case = T
        //2. 주사위를 두 번 던져 나온 두 수를 입력한다.
        //3. "Case X :" 출력한 후 두수의 합을 출력한다.

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//test case T
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case " + (i + 1) + ": " + (a+b));
        }

    }
}