import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 송찬이가 필요한 배터리 N
        //2. 선생님이 가져온 배터리 M
        //3. 맞으면1, 그외에는 0

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        if (N == M) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
