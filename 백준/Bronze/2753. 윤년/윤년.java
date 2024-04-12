import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 윤년이면 1, 아니면 0
        //2. (윤년은 4의 배수면서
        //3. 100의 배수가 아니거나)
        //4. || 400의 배수일 때이다

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }


    }
}