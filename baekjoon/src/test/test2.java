package test;

import java.util.Arrays;

public class test2 {

	
	public static void main(String[] args) {
		
		String msg = "202203171161165019,20220317111026,ktvwebmaster,한국정책방송원 in,.,ktvwebmaster,5,00,SKTL_SMS,sms_sktl_tx_c01,mmsdb1,KT,01085802059,0442048356,11361,,0,20220317111027,20220317111031,20220317111031,-100,01000,68002526,0000682713,,,82";
		String donemsg[] = msg.split(",", -1);
		
		System.out.println(Arrays.toString(donemsg));
		if(donemsg.length == 27 ) {
			System.out.println(donemsg[3] + "," + donemsg[4]);
		}
		System.out.println("length : " + donemsg.length);
	}
}
