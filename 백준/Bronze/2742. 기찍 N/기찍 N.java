
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 자연수 n이 주어진다.
        //2. 한줄에 하나씩 1부터 n까지 출력한다. 역순으로!

        int N = sc.nextInt();

        for (int i = N; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}