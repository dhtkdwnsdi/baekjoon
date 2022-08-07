package test;

/* package 구문을 넣으면 안됩니다 */
import java.util.*;
import java.io.*;

/* [Notice for Java]
 * - 기본 제공되는 뼈대 코드는 입출력의 이해를 돕기위해 제공되었습니다.
 * - 뼈대코드의 활용은 선택사항이며 코드를 직접 작성하여도 무관합니다.
 * 
 * - 별도의 병렬 처리나 시스템콜, 네트워크/파일접근 등을 하지 마세요 2
 * - 입출력의 양이 많은 문제는 BufferedReader와 BufferedWriter를 사용하면 시간을 단축할 수 있습니다.
 * - 클래스 이름은 항상 Main이어야 합니다. 주의하세요.
 * - 모든 입력과 출력은 System.in과 System.out 스트림을 이용해야 합니다.
 */

public class BusTest{

    //표준입력을 수행할 Scanner를 선언한다 
    public static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args)
    {   //프로그램의 시작부 
			int sh, sm;
			int[] bh = new int[5];
			int[] bm = new int[5];

			String input;
			String[] splited;

			//현재 '시'와 '분'을 입력 받는다
			input = scanner.next();
			splited = input.split(":");
			sh = Integer.parseInt(splited[0]);
			sm = Integer.parseInt(splited[1]);

			for(int i = 0 ; i < 5; i ++){
				//bh[i] := i번째 버스가 도착하는 '시'
				//bm[i] := i번째 버스가 도착하는 '분'
				input = scanner.next();
				splited = input.split(":");
				bh[i] = Integer.parseInt(splited[0]);
				bm[i] = Integer.parseInt(splited[1]);
			}

			int left = 0; //다음 버스까지 남은 시간을 이 변수에 저장 한다.
		
			int now = (sh*60) + sm; // 현재 시간을 Minute으로 저장한다.(가장 먼저 도착하는 버스 계산을 위해)
			int tempLeft = 0; //반복문 비교를 위해 남은 시간 임시로 저장하는 변수
			
			for(int i = 0; i<bh.length; i++) {
				int j = 1;
				if(((bh[i]*60 + bm[i]) - now) >= 0) {
					if(j==1) tempLeft = (bh[i]*60 + bm[i]) - now;
					
					if(tempLeft > ((bh[i]*60 + bm[i]) - now)) left = (bh[i]*60 + bm[i]) - now;
					else left = tempLeft;
					j++;
				} 
			}

			//정답을 출력한다 
			System.out.println(left);
    }
}
