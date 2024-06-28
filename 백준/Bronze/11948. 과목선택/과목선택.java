
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. jol 물리, 화학, 생물, 지구과학, 역사, 지리 6과목을 시험봤다.
        //2. 물,화,생,지 중 3과목을 선택하고, 역,지 중 1과목을 선택한다.
        //3. 시험 점수의 합이 가장 높게 나오도록 선택할 때 점수 총 합을 구해라.

        //가장낮은 점수를 제외한 나머지 3개의 합 구하기
        //2개중 높은 점수를 구하기

        int[] arr = new int[6]; // 여섯과목 점수 입력받기
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        int [] four = Arrays.copyOfRange(arr,0,4); // 4과목 중 선택3
        int [] two = Arrays.copyOfRange(arr, 4,6); // 2과목중 높은 점수

        Arrays.sort(four); //순서대로 배열
        int foursum = four[1] + four[2] + four[3]; //낮은 점수를 제외하고 더하기
        int twoof = Math.max(two[0],two[1]); // 둘 중 높은 점수 선택

        int result = foursum + twoof;
        System.out.println(result);
    }
}