
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 정수 3개, 오름차순으로 정렬하기
        //2. 가장작은수 -> 가장큰수 를 출력해라

        int [] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        for (int i = 0; i < 3; i++) {
            System.out.print(num[i] + " ");

        }
    }
}