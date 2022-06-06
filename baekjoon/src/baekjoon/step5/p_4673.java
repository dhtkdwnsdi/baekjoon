package baekjoon.step5;

public class p_4673 {

	public static void main(String[] args) {
		boolean[] check = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int a = findSelfNum(i);

			if (a < 10001) {
				check[a] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) { // false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

	}
 
	public static int findSelfNum(int a) {
		int selfNum = a;

		while (a != 0) {
			selfNum = selfNum + (a % 10);
			a = a / 10;
		}

		return selfNum;
	}

}
