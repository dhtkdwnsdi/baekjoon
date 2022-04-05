package baekjoon.step1;

import java.util.Scanner;

public class p_2588 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(((int)b/10)%10));
		System.out.println(a*((int) b/100));
		System.out.println(a*b);
	}

}
