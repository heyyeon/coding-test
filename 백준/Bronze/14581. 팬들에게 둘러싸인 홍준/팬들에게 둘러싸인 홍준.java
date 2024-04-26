import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // :fan: 에게 둘러쌓인 홍준
        // 1. 홍준의 아이디를 입력받는다. 길이는 20자 이하
        //2. 3개의 줄에 걸쳐 팬들에게 둘러쌓였다.

        Scanner sc = new Scanner(System.in);

        String f = ":fan:";
        String h = sc.nextLine();

        System.out.println(f + f + f);
        System.out.println(f + ":" + h + ":" + f);
        System.out.println(f + f + f);
    }
}