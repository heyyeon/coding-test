import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 총 금액 x
        //2. 구매한 물건의 종류의 수 n
        //3. 물건의 가격 a 와 개수 b 가 주어진다.
        //4. 일치하면 yes
        //5. 불일치 no 를 출력해라.

        int x = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a * b;
            }
        if (total == x) { //만약 총합이 같으면 yes, else no
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}