package ch05_Array;

import java.util.Scanner;

public class test4 {
	/*
	 * Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기 java Exam7 10 int num =
	 * Integer.parseInt(args[0]); 10의 약수 : 1,2,5,10,
	 */

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		System.out.println(num); 
			
		      for (int i = 1; i <= num; i++) {
	         boolean chk = false;
	         for (int j = 1; j <= num; j++) {
	            if (num % i ==0) {
	               chk = true; 
	               break;
	            }
	            
	         }
	         if (chk)
	            System.out.print( i + " "  );
	      }
	   }

	

			
		
		
		
		
		
		

}
