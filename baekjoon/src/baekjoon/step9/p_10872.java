package baekjoon.step9;

import java.util.Scanner;

public class p_10872 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = 0;
		int c = 1;
		while (b < a) {
			b++;
			c *= b; 
		}
		System.out.println(c);
	}
}
