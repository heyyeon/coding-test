import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 두 정수 H시와 M분이 주어진다.
        //2. 설정한 알람 시각보다 45분 앞서게

        int H = sc.nextInt();
        int M = sc.nextInt();

        if ( (H > 0) && (M >= 45) ) {
            System.out.println( H + " " +(M - 45) );
        } else if ( (H > 0) && (M < 45) ) {
            System.out.println( (H - 1) + " " + (M + 60 - 45) );
        } else if ( (H == 0) && (M >= 45) ) {
            System.out.println( H + " " + (M - 45) );
        } else if ( (H == 0) && (M < 45) ) {
            System.out.println( (H + 23) + " " + (M + 60 - 45) );
        }
    }
}