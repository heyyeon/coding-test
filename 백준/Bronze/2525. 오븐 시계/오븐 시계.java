
import java.io.IOException;
import java.util.Scanner;

        public class Main extends Exception {
            public static void main(String[] args) throws IOException {

                Scanner sc = new Scanner(System.in);
                //1. 두 정수 H시와 M분이 주어진다.
                //2. 요리하는데 필요한 시간 C 분 단위로 주어진다.
                //3. M + C >= 60 : H + 1 / (M+C) - 60 //분과 분이 60이랑 같거나 크면 시간에 1을 더해주고 분은 -60을 해준다.
                //4. M + C < 60 : H / M + C//분과분이 60보다 작으면 원래 시간에 분+분 값
                //5. H == 23 && M + C >= 60
                //만약 H가 23시인데 분+분이 60이거나 이상이라면 00시로 출력하고 분+분에서 -60해라

                //근데 H에 +1을 하게 되면 예시 2번의 문제에서 결과를 도출 할 수가 없다.
                //요리 시간은 얼마나 걸릴지 예상할 수 없기 때문에 이 전의 계산 값으로는 결과를 구할 수 없다.

                // int 로 변경되는 시간을 새로 담을 수 있는 변수를 만들어주기

                int H = sc.nextInt();
                int M = sc.nextInt();
                int C = sc.nextInt();

                int afterH = 0;
                int afterM = 0;

                afterM = (M + C) % 60;
                if (H >= 0 &&(M + C) >= 60) {
                    afterH = H + (M + C) / 60;
                } else if (H >= 0 &&(M + C) < 60) {
                    afterH = H;
                }
                if (afterH >= 24){
                    afterH -= 24;
                }
                System.out.println(afterH + " " + afterM);
            }
        }

