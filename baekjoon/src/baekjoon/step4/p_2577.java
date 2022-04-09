package baekjoon.step4;

import java.util.Scanner;

public class p_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String str = Integer.toString(a*b*c);
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for(int j =0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				};
			}
			System.out.println(count);
		}
		/*
		charAt�� ���ڿ��� index ���� ���� ���ڸ� �о���� ���
		String str = "�ȳ��ϼ���";
		str.charAt(0); // ��
		str.charAt(1); // ��
		str.charAt(2); // ��
		���ڿ� ���ڸ� ���ڷ� �ٲٰ� ���� ���� �ƽ�Ű�ڵ带 49(����)���� 48(int)�� �����ؾ� �Ѵ�.
		�� �� charAt() - '0'�� �ϸ� �ƽ�Ű�ڵ� 48�� ����ȯ�� �ȴ�.
		*/
	}
}
