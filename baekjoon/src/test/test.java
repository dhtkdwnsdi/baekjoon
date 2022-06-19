package test;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String contentInfo = "";
		String contentInfo1 = "202203171159961813_0.txt";
		String contentInfo2 = "202203171159961813_0.txt;202203171159961813_1.jpg";
		String contentInfo3 = "202203171159995269_0.txt;202203171159995269_1.jpg;202203171159995269_2.jpg";
		String contentInfo4 = "202203171165565807_0.txt;202203171165565807_1.jpg;202203171165565807_2.jpg;202203171165565807_3.jpg";
		String contentType = null;
		
		String[] arr_contentInfo = contentInfo.split(";");
		int txtCnt = 0;
		int jpgCnt = 0;
		for (int i = 0; i < arr_contentInfo.length; i++) {
			if("txt".equals(arr_contentInfo[i].substring(arr_contentInfo[i].length() -3, arr_contentInfo[i].length()))) txtCnt++;
			if("jpg".equals(arr_contentInfo[i].substring(arr_contentInfo[i].length() -3, arr_contentInfo[i].length()))) jpgCnt++;
		}
		if((txtCnt + (jpgCnt * 10)) < 10) contentType = "0"+ Integer.toString(txtCnt);
		else contentType = Integer.toString(txtCnt + (jpgCnt * 10));
		
		System.out.println(Arrays.toString(arr_contentInfo));
		System.out.println(contentType);
	}
}
