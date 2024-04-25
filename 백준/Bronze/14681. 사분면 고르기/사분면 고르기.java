
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 두 수를 입력받는다.
        //2. 양수인지 음수인지 조건을 걸어 출력한다.
        //2-1. x,y가 0 이상알 때 => 1사분면
        //2-2. x < 0, y > 0 => 2사분면
        //2-3. x < 0, y < 0 => 3사분면
        //2-4. x > 0, y < 0 => 4사분면

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0 ) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
