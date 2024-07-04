
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 나이가 17세이상, 몸무게가 80kg이상이면 성인부
        //2. 그 외는 모두 청소년부이다.
        //이름은 알파벳 대/소문자로만 이루어진다.
        //# 0 0 는 종료한다.


        while (true){ // 정하진 수가 없기 때문에, 무한루프를 돌린다.
        String name = sc.next();
        int age = sc.nextInt();
        int kg = sc.nextInt();

            if (name.equals("#") && age == 0 && kg == 0) { //#00이 나오면 멈춰라
              break;
            }
            if (age > 17 || kg >=80 ) {
                System.out.println(name + " Senior");
            }else {
                System.out.println(name + " Junior");
            }
        }
    }
}