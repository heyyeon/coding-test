
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 집 -> 학교 : 초
        //2. 학교 -> 피방 : 초
        //3. 피방 -> 학원 :
        //4. 학원-> 집 :
        // 총시간은 항상 1분 0초 이상 59분59초 이하
        //총 이동시간을 구해라, x분 y초

        int Y = 0;
        int X = 0;
        for (int i = 0; i < 4; i++) {
        Y += sc.nextInt();
        }
        if (Y >= 60) {
            System.out.println(Y/60);
            System.out.println(Y%60);
        }
    }
}
