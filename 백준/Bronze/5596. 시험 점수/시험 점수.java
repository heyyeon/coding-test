
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 민국S, 만세T는 4과목 시험을 봤다.
        //2. 더 큰 총점수를 출력해라
        //3. 단, 동점일 경우 민국 총점을 출력해라.

        //민국 총합
        int S = 0;
        for (int i = 0; i <4 ; i++) {
            S += sc.nextInt();
        }

        //만세 총합
        int T = 0;
        for (int i = 0; i < 4; i++) {
            T += sc.nextInt();
        }

        System.out.println(Math.max(S,T));
    }
}
