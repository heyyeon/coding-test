
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 과목의 개수 n을 숫자로 받는다. (소수점 자리 표시한다.)
        //2. 현재 성적을 숫자로 받는다.
        //3. 최대 성적 값 m이 주어진다.
        //4. 새로운 점수로 변환한다. 점수/m * 100
        //5. 새로운 평균을 출력한다. => 새로운 점수 / n

        int n = sc.nextInt();
        double [] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double m = 0; //최댓값
        for (int i = 0; i < n; i++) {
            if (arr[i] > m ) {
                m = arr[i];
            }
        }

        double sum = 0; //새로운 점수 전환하기
        for (int i = 0; i < n; i++) {
            sum += (arr[i] / m) * 100;
        }

        System.out.println(sum/n); //새로운 점수를 통한 평균을 구한다.
    }
}
