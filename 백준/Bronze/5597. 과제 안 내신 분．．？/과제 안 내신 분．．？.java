
import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //1. 총 30명 중 28명이 과제를 제출했다.
        //2. 제출 안한 학생 2명의 출석번호를 출력해라
        //3. 출력은 2줄로, 첫번째 줄에는 제출하지 않은 학생의 출석번호 중 적은 것, 2째줄은 그다음

        //30명의 명단을 배열로 변수를 만든다.
        //28 명을 대조하여 담는 변수를 만든다.

        int [] arr = new int[31];//0을 제외했는데 왜,, 31로 해야하는거야?

        for (int i = 1; i <29 ; i++) {//28명 조회
           int S = sc.nextInt();// 누가 제출했는지 출석번호 입력
            arr[S] = 1; //학생인덱스에 출석번호 저장: 이라고 되어 있는데 이해가 안가 왜 1로 해야해?
        }
        for (int i = 1; i <arr.length; i++) {//출석부 30명 조회
            if (arr[i] !=1) { //출석번호 중 제출하지 않은 인원 추리기
                System.out.println(i);
            }
        }
    }
}
