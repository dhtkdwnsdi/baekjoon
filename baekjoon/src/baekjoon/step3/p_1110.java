package baekjoon.step3;

import java.util.Scanner;

public class p_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = a;
		int cnt = 0;
		sc.close();
		
		while (true) {
			int x = (int) b/10;
			int y = b%10;
			b = y*10 + (x+y)%10; 		
			cnt++;
			if(b == a) break;
		}
		System.out.println(cnt);
	}
}
