import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. a, b 입력
        //2. a + b
        //3. 테스트케이스가 주어진다.
        //4. 각 테스트케이스마다 Case #x: A + B + C 를 출력해라

     int t = sc.nextInt();
     for (int i = 1; i<=t; i++){
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = a + b;

         System.out.println("Case #"+ i + ": " + a + " + " + b + " = " + c);
     }

    }
}