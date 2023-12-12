package ch03_op;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128;
		var4 = var1;
		var1 =  var3;  
		float var5 = 1.0;
		double var6 = 1.0;
		var5 =var6;
		var6 = var5;
		
		
		-------------------
		
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128;
		var4 = var1;
		var1 =  (byte) var3;  //수정
		float var5 = 1.0f;    //수정

		double var6 = 1.0;
		var5 =(float) var6;     //수정

		var6 = var5;


	}

}
