import java.io.IOException;
import java.util.Scanner;


    public class Main {
    public static void main(String[] args) throws IOException {
        //1. 정수 n개로 이루어진 수열 a와
        //2. 정수 x가 주어진다.
        //3. a에서 x보다 작은 수를 모두 출력하게 해라

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int [] arr = new int [N]; // 배열을 만들어서 for문을 돌려서 값 받아오기

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();

            if(arr[i] < X){
                System.out.print(arr[i] +" ");
            }

        }

    }
}