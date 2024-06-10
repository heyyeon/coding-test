
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        // s = (r1+r2)/2
        // r2 를 구해라!
        // s * 2 - r1

        int R1 = sc.nextInt();
        int S = sc.nextInt();

        System.out.println(S*2 - R1);
    }
}

