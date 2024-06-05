
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n ; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

