package baekjoon.step3;

import java.util.Scanner;

public class p_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr1 = new int[a];
		int[] arr2 = new int[a];
		
		for (int i = 0; i < a; i++) {
			arr1[i] = sc.nextInt(); 
			arr2[i] = sc.nextInt(); 
		}
		sc.close();
		
		for (int i = 0; i < a; i++) {
			System.out.println("Case #" + (i+1) + ": " + arr1[i] + " + " + arr2[i] + " = " + (arr1[i] + arr2[i]));
		}
		
	}
}
