import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//대소문자가 서로 바뀌어 출력하게 하라.
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            //charAt() String으로 저장된 문자열 중 한 글자만 선택해서 char타입으로 변환해준다.
            if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c))
                    c = Character.toLowerCase(c);
            System.out.print(c);
        }

    }
}