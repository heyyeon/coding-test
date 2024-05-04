import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 밑변의 길이 W, 높이는 H 인 삼각형의 넓이
        //2. W * H / 2
        //3. 소수점 아래 첫번째 자리 까지 출력한다.

        Scanner sc = new Scanner(System.in);
        double W = sc.nextInt();
        double H = sc.nextInt();
        double area = W * H / 2;

        System.out.printf("%.1f", area);
    }
}