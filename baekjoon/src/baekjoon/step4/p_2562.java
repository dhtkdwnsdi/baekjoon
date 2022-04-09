package baekjoon.step4;

import java.util.Scanner;

public class p_2562 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int max = 0;
//		int index = 0;
//		
//		for (int i = 0; i < 9; i++) {
//			int a = sc.nextInt();
//			if(i == 0 ) max = a;
//			else {
//				if(a>=max) {
//					max = a;
//					index = i+1;
//				}
//			}
//		}
//		System.out.println(max);
//		System.out.println(index);
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {	sc.nextInt(), sc.nextInt(), sc.nextInt(),
						sc.nextInt(), sc.nextInt(), sc.nextInt(),
						sc.nextInt(), sc.nextInt(), sc.nextInt()};
		sc.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}
}
