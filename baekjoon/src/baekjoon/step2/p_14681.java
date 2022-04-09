package baekjoon.step2;

import java.util.Scanner;

public class p_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if(a>0) {
			if(b>0) {
				System.out.println(1);
			} else if(b<0) {
				System.out.println(4);
			}
		} else if(a<0) {
			if(b>0) {
				System.out.println(2);
			} else if(b<0) {
				System.out.println(3);
			}
		}
		
		
	}
}