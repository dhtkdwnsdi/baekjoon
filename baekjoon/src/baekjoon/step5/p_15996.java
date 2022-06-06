package baekjoon.step5;

public class p_15996 {

	class Test {
		long sum(int[] a) {
			long sum = 0;
			
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
	}
}
