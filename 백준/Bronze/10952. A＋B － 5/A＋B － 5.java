import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //0 0 을 입력했을 떄 끝나도록
        // while(true){
       // if(조건) break;

        while(true){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0)
                break;
            System.out.println(a + b);
        }

    }
}