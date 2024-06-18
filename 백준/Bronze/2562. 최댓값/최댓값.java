
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1. 자연수 9개 중 최댓값을 찾아라
        //2. 몇번째수인지 구해라.

        int [] arr = new int[9]; //배열 아홉자리로 만들어주고
        int max = 0; //최대값 저장할 변수생성
        int index = 0; // 위치 저장할 변수 생성

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) { //i가 max보다 클 경우에는
                max = arr[i];//max에 저장해준다(업데이트해준다.)
                index = i + 1;// 위치도 함께 저장해주는데, 이때 인덱스는 0부터기때문에 +1을 한다.
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
