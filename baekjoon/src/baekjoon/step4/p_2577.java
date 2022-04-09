package baekjoon.step4;

import java.util.Scanner;

public class p_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String str = Integer.toString(a*b*c);
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for(int j =0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				};
			}
			System.out.println(count);
		}
		/*
		charAt은 문자열에 index 값을 통해 문자를 읽어오는 방법
		String str = "안녕하세요";
		str.charAt(0); // 안
		str.charAt(1); // 녕
		str.charAt(2); // 하
		문자열 숫자를 숫자로 바꾸고 싶을 때는 아스키코드를 49(문자)에서 48(int)로 변경해야 한다.
		그 때 charAt() - '0'을 하면 아스키코드 48로 형변환이 된다.
		*/
	}
}
