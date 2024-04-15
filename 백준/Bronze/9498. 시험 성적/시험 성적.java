import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. A:90-100점
        //2. B:80-89점
        //3. C: 60-69점
        //4. 나머지는 F를 입력받는다.
        //5. 시험점수는 0보다 크거나 같고, 100보다 작거나 같은 정수

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 90){
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}