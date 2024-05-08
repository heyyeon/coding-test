import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //고유번호 5개를 받고 각각 제곱한다.
        //10으로 나눈 나머지를 구해라.
        int sum = 0;
        for (int i = 0; i < 5; i++) {//5개 수를 입력받는다고 했으니 for문 통해 5개 수 입력하기
            int num = sc.nextInt();
            sum += Math.pow(num,2); //Math의 pow함수를 사용, 뒤의 2는 2번 제곱한다.
        }
        System.out.println(sum % 10);//나머지 연산 구하기 위해 % 연산자
    }
}

