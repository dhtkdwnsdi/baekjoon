package baekjoon.step4;

import java.util.Scanner;

public class p_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int[] arr_sum = new int[a];
		int sum = 0;
		int score = 1;
		
		for (int i = 0; i < arr.length; i++) {
			String ox = sc.next();
			for (int j = 0; j < ox.length(); j++) {
				if("O".equals(String.valueOf(ox.charAt(j)))) {
					sum += score;
					score++;
				} else {
					score = 1;
				}
			}
			arr_sum[i] = sum;
			sum = 0;
			score = 1;
		}
		for (int i = 0; i < arr_sum.length; i++) {
			System.out.println(arr_sum[i]);
		}
		
	}
}
