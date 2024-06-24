
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //0. 42크기의 boolean 배열을 만든다.
        //1. 10개의 숫자를 입력 받는다.
        //2. 42로 나머지를 구한다.
        //3. 나머지가 있는 경우 true를 반환한다.
        //4. 다시for문을 돌리고 true값이 있을 경우 count를 증가시킨다.
        
        boolean [] arr = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr [sc.nextInt() % 42] = true;
        }
        for (int i = 0; i < 42; i++) {
            if (arr[i] == true) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
