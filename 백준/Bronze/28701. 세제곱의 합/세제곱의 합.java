import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //세 줄을 출력할 것이다. 정수는 n
        //1부터 n까지의 합
        //1부터 n까지의 합의 제곱
        //1부터 n까지의 세제곱의 합

        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);
        System.out.println(total * total);

        total = 0;
        for (int i = 1; i <= n ; i++) {
            total += i * i* i;
        }
        System.out.println(total);
    }
}

