import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 첫째줄 : A, 둘째줄 : B

        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}