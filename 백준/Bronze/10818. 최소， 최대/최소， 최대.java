
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. n개의 최솟값, 최대값을 출력해라.

        int n = sc.nextInt();
        int [] arr = new int[n]; //n의 길이로 초기화한다.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); //배열 정렬
        System.out.println(arr[0] + " " + arr[n-1]);
        //배열은 0부터기 때문에 최소값은 0 최대값은 n-1
    }
}
