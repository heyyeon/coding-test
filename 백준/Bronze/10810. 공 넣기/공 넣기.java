
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. n개의 바구니, 테스트케이스 n개를 받아온다.
        //2. M번 공을 넣으려고 한다. 정한 바구니에 같은 번호가 적혀있는 공으로, 이미 있는 경우 들어있는 공을 빼고, 새로 넣는다.
        //세 정수 i,j,k 가 주어진다. => i번 바구니에서부터 j번바구니까지에 k번 번호가 적혀있다는 공을 넣는다.
        //3. M번 공을 넣은 이후 각 바구니에 어떤 공이 들어 있는지 출력해라.

        int n = sc.nextInt(); //바구니
        int m = sc.nextInt(); // 공
        int [] arr = new int[n+1]; //바구니가 1부터 시작하기 때문에 +1

        for (int l = 0; l < m; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int o = i; o <=j ; o++) {
                arr[o] = k;
            }
        }
        for (int i = 1; i <=n ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
