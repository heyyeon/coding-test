
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 두 정수 a와 b를 입력받는다.
        //2. a/b를 출력하는 프로그램을 작성한다.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = a / b;
        System.out.println(c);
    }
}
