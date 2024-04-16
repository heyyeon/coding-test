
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1;  i <= t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int answer = a + b;

            System.out.println(answer);
        }
    }
}