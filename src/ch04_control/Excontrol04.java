package ch04_control;

import java.util.Scanner;

public class Excontrol04 {
/*
 * 화면에서 자연수를 입력받아 각각의 자리수의 합을 구하기
 * [결과]
 * 자연수를 입력하세요
 * 123
 * 자리수 합 : 6
 * 자연수를 입력하세요
 * 1357
 * 자리수 합 : 16
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		 
		int sum=0;
		
		for ( int i = num ; i != 0 ; i /=10 ) {
			System.out.println(i%10);
			sum +=(i%10);
		}
				System.out.println("자리수 합 :" + sum);
				
				
		int value = num;
		sum=0;
		while(value !=0) {	
			sum +=(value%10);
			value /=10;
			
			
			
			
		}
		System.out.println("자리수 합 :" + sum);
		
		
		
		
		
		
		
	}

}
