package ch05_Array;

import java.util.Scanner;

public class test2 {
	/*	
	숫자를 입력하세요 
	8
	***************
	 ************* 
	  ***********  
	   *********   
	    *******    
	     *****     
	      ***      
	       *       
	      ***      
	     *****     
	    *******    
	   *********   
	  ***********  
	 ************* 
	***************
	*/	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			
			int len=scan.nextInt();
			
			
			for(int i=len; i>=1; i--) {
				for(int j=0; j<len-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=(i*2)-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1; i<=len; i++) {
				for(int j=1; j<=len-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=(i*2)-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
			
			
			
			
		}

}
