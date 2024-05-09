import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //두 정수가 주어진다. 첫번째 수가 두번째수보다 큰지 구하는 프로그램
        //1. 테스트케이스 이루어진다.
        //2. 두 정수를 정한다.
        //3. 비교한다. 첫번째 수가 두번쨰보다 크면 yes, 아니면 no, 00이면 종료

        //반복되고 00 을 통해 break 되는 while 문을 사용하자.
        while (true){
            int a = sc.nextInt(), b = sc.nextInt();
            if (a == 0 && b == 0)
                            break;
            if (a>b)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

