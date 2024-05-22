import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 100배수 : A , 부가가치세포함 : B
        //B를 제외한 A가격을 구해보자

        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int A = B / 11;

        System.out.println(B-A);
        }
    }
