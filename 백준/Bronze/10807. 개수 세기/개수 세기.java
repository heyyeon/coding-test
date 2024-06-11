
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 정수의 개수 : n
        //2. 정수들
        //3. 찾으려는 정수 v
        // : 정수 중 v가 몇개인지 출력해라

        int n = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
