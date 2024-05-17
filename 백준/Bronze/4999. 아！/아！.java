import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //기본 낼 수 있는 "aaah"
        //의사가 듣기 원하는 aah
        // 기본으로 낼 수 있는 소리보다 더 크게 요구하면 no, 가능하면 go

        String j = sc.next();
        String d = sc.next();

        if (j.length() >= d.length()) {
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}