
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 세트로 구매하면 가격의 합계에서 50원을 빼준다.
        //2. 햄버거는 3종류, 음료는 2종류이다.
        //3. 햄버거와 음료의 가격이 주어졌을 때 가장 싼 메뉴의ㅣ 가격을 출력해라

       int b1 = sc.nextInt();
       int b2 = sc.nextInt();
       int b3 = sc.nextInt();

       int d1 = sc.nextInt();
       int d2 = sc.nextInt();

       //가장 저렴한 햄버거와 음료 찾기
        int minBurger = Math.min(Math.min(b1,b2),Math.min(b2,b3));
        int minDrink = Math.min(d1,d2);

        int set = minBurger + minDrink - 50;

        System.out.println(set);
    }
}