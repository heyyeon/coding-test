import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. A,B,C를 입력받는다.
        //2. 덧셈을 출력해라
        //3.A,B,C(1 ≤ A, B, C ≤ 10¹²) 이 공백을 사이에 두고 주어진다 ???

        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long c = sc.nextLong();

        System.out.println(a + b + c);
    }
}