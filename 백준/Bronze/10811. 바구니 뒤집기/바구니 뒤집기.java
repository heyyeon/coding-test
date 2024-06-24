
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1.1번부터 n번까지의 바구니를 변수로 생성한다.
        //2.m번 바구니의 순서를 역순으로 만든다.
        //3.역순 방법에는 i,j이 주어지고, i부터 j까지의 순서를 역순으로 만든다.

        int n = sc.nextInt(); //바구니
        int m = sc.nextInt(); //역순할 숫자
        int [] arr = new int[n+1];//바구니를 만들었음

        for (int i = 1; i <=n ; i++) {//각 바구니에 숫자 넣어줌
            arr[i]=i;
        }

        for (int a = 1; a <= m; a++) { //역순할 숫자만큼 설정
            int i = sc.nextInt(); //i 번째부터
            int j = sc.nextInt(); //j 번째까지
            int tmp = 0;

            while (i < j){//if문의 조건을 반대로 적어준다. 크거나 같다의 반대는 작다.

                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;

                  i++;
                  j--;

            }

        }
        for (int i = 1; i <= n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
