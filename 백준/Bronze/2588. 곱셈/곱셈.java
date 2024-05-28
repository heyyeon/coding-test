import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 세자리 수를 두 개 받는다.
        //2. 첫 번째 세자리수와 두 번째 줄 일의 자리와 곱한다.
        //3. 첫 번째 세자리수와 두 번째 줄 십의 자리와 곱한다.
        //4. 첫 번째 세자리수와 두 번째 줄 백의 자리와 곱한다.
        //5. 2-4과정의 결과를 더한다.

        int A = sc.nextInt();
        int B = sc.nextInt();

        int answer1 = (B%100)%10 * A; // B의 나머지는 85, 우리가 필요한 건 5(일의자리), 따라서 한 번 더 나머지값
        int answer2 = (B%100)/10 * A; // B의 나머지는 85, 우리가 필요한 건 8(십의자리),는 10으로 나눈다.
        int answer3 = B/100 * A;//B의 백의 자리는 나머지를 알 필요가 없음, 따라서 바로 100으로 나눈다.
        int answer4 = A * B;

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        }
    }
