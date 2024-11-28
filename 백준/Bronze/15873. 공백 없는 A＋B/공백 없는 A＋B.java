
import java.io.IOException;
import java.util.Scanner;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        //1. 자연수A, B가 주어짐 (0 < A, B ≤ 10)
        //2. A+B 값을 구해라
        //3. 두 수 사이에 공백이 없다.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(1) == '0'){
            System.out.println(10 + Integer.parseInt(str.substring(2)));
        } else {
            System.out.println(Character.getNumericValue(str.charAt(0)) + Integer.parseInt(str.substring(1)));
        }

    }
}