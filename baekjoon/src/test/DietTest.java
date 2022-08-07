package test;

import java.io.*;

public class DietTest {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int N = Integer.parseInt(input);
		int[] str = new int[N];
		for(int i = 0; i < N; i++) {
			str[i] = Integer.parseInt(br.readLine());
 		}
		
		boolean[] result = new boolean[N];
		
		for(int i = 0; i < str.length; i++) {
			int testInt = str[i];
			result[i] = false;
			while (testInt > 0) {
				if((testInt % 7) == 0 || (testInt % 3) == 0) {
					result[i] = true;
					break;
				} else {
					testInt = testInt - 3;
				}
				
			}
		}
		
		
		
		for(int i =0; i<N; i++) {
			System.out.println("Test Case #"+(i+1));
			if(result[i] == true) {
				System.out.println("YES");
			} else if(result[i] == false) {
				System.out.println("NO");
			}
		}
		
		br.close();
		
	}
}
