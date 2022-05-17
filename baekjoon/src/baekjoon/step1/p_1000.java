package baekjoon.step1;

import java.util.Scanner;

public class p_1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int now = sc.nextInt();

//		1ÀÏ ÂÉ°³±â
//		for(int i=0; i<288; i++) {
//			String hh = String.format("%02d", (int) ((5*i)/60));
//			String mm = String.format("%02d",  (5*i)%60);
//			String realLogTime = now + hh + mm;
//			System.out.println(realLogTime);
//		}

//		6½Ã°£ ÂÉ°³±â
		for(int i=0; i<72; i++) {
			int hh = (5*i)/60;
			String mm = String.format("%02d",  (5*i)%60);
			String realLogTime = (now + hh) + mm;
			System.out.println(realLogTime);
		}
	}
}	
