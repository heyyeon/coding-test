
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 단어가 주어진다.
        //2. 모음의 개수를 출력하는 프로그램을 작성해라.

        String a = sc.nextLine(); //단어를 받아
        int count = 0; //개수를 저장할 변수 받기

        for (int i = 0; i < a.length(); i++) {//문자열의 길이만큼 반복한다.
            char ch = a.charAt(i); // 현재 문자를 가져와

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; //모음이면 카운터를 증가시켜라
            }
        }
        System.out.println(count);
    }
}