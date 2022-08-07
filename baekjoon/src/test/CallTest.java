package test;

import java.io.*;
import java.util.*;
import java.lang.*;

class CallTest {
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt(); // 송수신 기록의 수 
		String[] logs = new String[n+1]; // 송수신 기록
		for(int i = 0 ; i < n+1 ; i ++)
		{
			logs[i] = scanner.nextLine().trim();
		}
		
		List<String> list = new ArrayList<>(Arrays.asList(logs));
		for(int i = 1; i < list.size(); i++) {
			
			if(list.get(i).equals(list.get(i-1))) {
				list.remove(i-1);
				list.set(i-1, list.get(i-1) + " (2)");
			}
		}
		
		System.out.println(list.size()-1);
		for(int i = 1; i < list.size(); i++) {
			System.out.println(list.get(i));
		}


	}
	
}