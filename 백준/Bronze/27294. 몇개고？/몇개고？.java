import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 시간을 의미하는 정수, 술의 유무를 의미하는 정수가 주어진다.
        //T: 11이하면 아침시간, 12-16점심, 그 이상은 저녁
        //S: 술과 함께 먹으면 1, 술없이 초밥만 먹어 0
        // 술하고 같이 먹거나, 점심식사가 아닐 때에는 280
        //점심식사이면서 술과 같이 먹지 않을 때는 320

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int S = sc.nextInt();

        if (S == 0 && 12 <= T && T <= 16) {
            System.out.println("320");
        }else {
            System.out.println("280");
        }
    }
}