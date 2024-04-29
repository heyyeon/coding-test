import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 알파벳으로 이루어진 단어 입력받기
        //2. 길이를 출력
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        System.out.println(N.length());
        
    }
}