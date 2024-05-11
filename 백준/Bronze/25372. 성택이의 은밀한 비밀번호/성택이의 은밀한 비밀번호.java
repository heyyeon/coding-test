import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. 비밀번호는 6자리 이상 9자리 이하
        //2. 테스트케이스가 주어진다.
        //3. 사용가능하면 yes, 아니면 no

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 0; i <n ; i++) { //테스트케이스 만큼 돌릴거야.
            //문자열이 주어질거고 이 문자열은 6이상 9이하야.
            String pass =sc.next();

            if (pass.length() >= 6 && pass.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

