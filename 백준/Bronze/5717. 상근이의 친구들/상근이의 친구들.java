
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 남자친구 M, 여자친구 F 가 주어진다.
        //2. 친구의 총합을 구해라
        //3. 0 0 마지막 수를 만나면 끝닌다.

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b==0) {
                break;
            }
                    System.out.println(a + b);
                }
            }
        }
        
