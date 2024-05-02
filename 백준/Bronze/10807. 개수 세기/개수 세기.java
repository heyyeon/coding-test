
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 첫째줄에 정수 개수 n개
        //2. 둘째 줄에는 정수가 공백으로 구분되어져있다.
        //3. 셋째 줄에는 찾으려는 정수 v가 주어진다.
        //4. 주어진 정수 n개의 정수 중 v가 몇개인지 출력해라

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정수의 개수
        int[] arr = new int[n]; // n의 배열

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //배열도 입력받는다.
            }
        int v = sc.nextInt();//정수를 입력받는다.
        int cnt = 0; // 출력할 값

        for(int a : arr){ //for each 문 활용
            if (a == v) cnt++;
        }
        System.out.println(cnt);
    }
}
