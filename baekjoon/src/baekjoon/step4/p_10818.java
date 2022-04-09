package baekjoon.step4;

import java.util.Scanner;

public class p_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		// 선언과 동시에 배열 크기 할달
		int[] arr = new int[a];
		int b = 0;
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < a; i++) {
			b = sc.nextInt();
			if(i == 0 ) {
				max = b;
				min = b;
			} else {
				if(b>=max)
					max = b;
				if(b<=min)
					min = b;
			}
				
		}
		System.out.println(min + " " + max);
		
	}
}
