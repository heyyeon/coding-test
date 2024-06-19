
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. n개의 바구니를 받는다. ->바구니에는 공이 1개씩 들어있고, 처음에는 바구니 번호와 같은 공이 들어있다.
        //2. m번의 공을 바꾸고자 한다. -> 바꿀 바구니 2개를 선택, 두 바구니의 공을 서로 교환한다.
        //3. m번 공을 바꾼 후 각 바구니에 어떤 공이 들어 있는지 구해라.

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n+1];

        for (int i = 1; i <=n ; i++) {
            arr[i] = i; //바구니의 번호와 같은 공이기 때문, for문안에 for문을 사용하지 않은 이유는 배열이기 때문에 => 방에 번호가 다 차기 전에 다음 for문이 이루어져버린다.
        }
        for (int j = 1; j <=m ; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int tmp = arr[x]; 
            arr[x] = arr[y];
            arr[y] = tmp;
        }
        for (int i = 1; i <=n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
