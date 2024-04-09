import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 자연수 a,b가 주어진다.
        //2. A+B,
        //3. A-B,
        //4. A*B
        //5. A/B(몫)
        //6. A%B(나머지)를 출력하는 프로그램
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}