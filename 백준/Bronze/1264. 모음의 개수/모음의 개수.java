
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 여러개의 테스트 케이스로 영어문장이 주어진다.
        //2. 각각의 문장 중 a,e,i,o,u 대소문자가 몇 개 있는 지 출력해라
        //3. #는 끝내라는 뜻이다.
        //4.

        while (true){
            String A = sc.nextLine();
            if(A.equals("#")) {
                break;
            } else{
                int count = 0;
                for (int i = 0; i < A.length(); i++) {
                    if (A.charAt(i) == 'a' || A.charAt(i) == 'A') {//''문자, ""문자열
                        count ++;
                    } else if (A.charAt(i) == 'e' || A.charAt(i) == 'E') {
                        count ++;
                    } else if (A.charAt(i) == 'i' || A.charAt(i) == 'I') {
                        count++;
                    } else if (A.charAt(i) == 'o' || A.charAt(i) == 'O') {
                        count++;
                    } else if (A.charAt(i) == 'u' || A.charAt(i) == 'U') {
                        count++;
                    }
                }
                System.out.println(count);

            }
        }

    }
}
