import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger answer = (A.add(B)).multiply (A.subtract(B));

        System.out.println(answer);




        }
    }
