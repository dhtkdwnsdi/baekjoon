package baekjoon.step2;

import java.util.Scanner;

public class p_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int a = h*60 + m + n;
		h = a/60;
		m = a%60;
		
		if (h>=24) {
			h= h-24;
		}
		
		System.out.println(h + " " + m);
		
	}

}
