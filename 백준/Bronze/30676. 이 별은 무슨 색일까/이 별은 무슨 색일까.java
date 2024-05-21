import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 첫째줄 : y

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        if ((620 <= c) && (c <= 780)) {
            System.out.println("Red");
        } else if ((590 <= c) && (c < 620)) {
            System.out.println("Orange");
        } else if ((570 <= c) && (c < 590)) {
            System.out.println("Yellow");
        } else if ((495 <= c) && (c < 570)) {
            System.out.println("Green");
        } else if ((450 <= c) && (c < 495)) {
            System.out.println("Blue");
        } else if ((425 <= c) && (c < 450)) {
            System.out.println("Indigo");
        }  else if ((380 <= c) && (c < 425)) {
            System.out.println("Violet");
        }
    }
}