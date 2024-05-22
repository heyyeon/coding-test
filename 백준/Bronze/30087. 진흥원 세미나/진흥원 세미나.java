import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String A = sc.next();
            
            if (A.equals("Algorithm")) {
                System.out.println("204");
            } else if (A.equals("DataAnalysis")) {
                System.out.println("207");
            } else if (A.equals("ArtificialIntelligence")) {
                System.out.println("302");
            } else if (A.equals("CyberSecurity")) {
                System.out.println("B101");
            } else if (A.equals("Network")) {
                System.out.println("303");
            } else if (A.equals("Startup")) {
                System.out.println("501");
            } else if (A.equals("TestStrategy")) {
                System.out.println("105");
            }
        }

        }
    }
