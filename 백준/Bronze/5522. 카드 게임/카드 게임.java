
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //1. 게임은 5회 진행된다. 총점으로 승부를 본다.
        //2. 총점을 더해라

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
