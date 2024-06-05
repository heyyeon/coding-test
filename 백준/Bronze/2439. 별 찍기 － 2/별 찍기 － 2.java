
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 띄어쓰기 4개
        //이중포문
        //
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) { //공백
                System.out.print(" ");
            }

            for (int k = 1; k <= i ; k++) {//별
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

