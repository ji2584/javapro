package ch05_Array;

import java.util.Scanner;

public class test1 {
	/*
	 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
		피보나찌 수열에서 값이 1000 이전의 수까지 프린트 하세요

	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1;
		int second =1;
		int element = first + second;
			System.out.print(first);
			
			while(element<1000){
				System.out.print("," +second);
				
				element = first + second;
				first = second;
				second=element;
				
			}
			
		
		
		 
	}

}
