package baekjoon.step9;

import java.util.Scanner;

public class p_10870 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.println(fibo_5(a));
	}
	
	public static int fibo_5(int n) {
	
		if(n<=1)
			return n;
		else
			return fibo_5(n-2) + fibo_5(n-1); 
	}
}
