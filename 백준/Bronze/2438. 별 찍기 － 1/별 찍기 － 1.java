import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 첫째줄은 별 1개
        //2. 둘째줄은 별 2개
        //3. n째줄은 별 n개

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       for(int i = 1; i <= n; i++){//테스트케이스에 관해 for
           for(int j = 1; j <= i; j++){
               System.out.print("*"); //print로 하는 이유: i갯수만큼 한 줄에 표현되어야 하기 때문
           }
           System.out.println(); //줄바꿈으로
       }
    }
}
