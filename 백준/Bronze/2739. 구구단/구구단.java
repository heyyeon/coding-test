import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. n 입력받기
        //2. 구구단 n단 출력하자

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}