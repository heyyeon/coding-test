import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // Math.pow(a,b) -> a의 b제곱
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;

        for (int i = 1; i <= n; i++) {
            totalA = totalA + i; // 중첩 // 값을 더해줌
            totalB = (int)Math.pow(totalA, 2); // 중첩X // 값이 계속 바뀜 최종적으로 Math.pow(n, 2); 와 같음
            totalC = totalC + (int)Math.pow(i, 3); // 1 6 27 64 125
        }
        
        System.out.println(totalA);
        System.out.println(totalB);
        System.out.println(totalC);
    }
}