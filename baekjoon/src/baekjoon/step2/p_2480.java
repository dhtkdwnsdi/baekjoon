package baekjoon.step2;

import java.util.Scanner;

public class p_2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		if(a==b && b==c && c==a) {
			count = 10000+(a*1000);
		} else if(a!=b && b!=c && c!=a) {
			if(a>b) {
				if(a>c) count = 100*a;
				else count = 100*c;
			} else if(a<b) {
				if(b>c) count = 100*b;
				else count = 100*c;
			}
		} else {
			if(a==b) count = 1000+(a*100);
			else if(a==c) count = 1000+(a*100);
			else count = 1000+(b*100);
		}
		System.out.println(count);
	}
}
