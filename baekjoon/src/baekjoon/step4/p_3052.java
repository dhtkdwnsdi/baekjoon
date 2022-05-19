package baekjoon.step4;

import java.util.Scanner;

public class p_3052 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		boolean b;
		int cnt = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		for(int i = 0; i<arr.length; i++) {
			b = false;
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i] == arr[k]) {
					b = true;
					break;
				}
			}
			if(b == false) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
