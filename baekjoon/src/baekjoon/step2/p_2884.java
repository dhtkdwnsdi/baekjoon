package baekjoon.step2;

import java.util.Scanner;

public class p_2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		int sum = h*60 + m - 45;
		if(sum < 0) {
			sum = 1440 + sum;
		}
		h = (int) sum / 60;
		m = sum % 60;
		
		System.out.println(h + " " + m);
		
	}
}
