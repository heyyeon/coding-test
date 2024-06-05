
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //걷는 시간
        int A = sc.nextInt(); // 버스탑승시간
        int B = sc.nextInt(); // 지하철탑승시간

        if (A < B) {
            System.out.println("Bus");
        } else if (A > B) {
            System.out.println("Subway");
        } else if (A == B) {
            System.out.println("Anything");
        }
    }
}

