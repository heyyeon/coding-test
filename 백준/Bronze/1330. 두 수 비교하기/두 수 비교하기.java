import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 두 정수 A와 B를 입력한다.
        //2. A와 B를 비교하는 프로그램

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(">");
        }else if (a < b){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}