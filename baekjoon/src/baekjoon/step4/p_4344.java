package baekjoon.step4;

import java.util.Arrays;
import java.util.Scanner;

public class p_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			int[] arr_2 = new int[a];
			
			for (int j = 0; j < arr_2.length; j++) {
				arr_2[j] = sc.nextInt();
			}
			sum = Arrays.stream(arr_2).sum();
			
			int cnt = 0;
			for (int j = 0; j < arr_2.length; j++) {
				if(arr_2[j] > sum/a) cnt++;
			}
			
			System.out.printf("%.3f", (double) cnt / a * 100);
			System.out.println("%");
		}
	}

}
