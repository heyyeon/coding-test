import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 세로길이 : a, 가로길이: b 의 넓이를 단위로 구해라
        //2. 단위는 생략하고 구해라

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( a * b );

    }
}