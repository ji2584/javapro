package ch04_control;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		 
		int num = scan.nextInt();
		int box = 0;
		System.out.println("필요한 상자의 갯수" + ":" + (box = ((num % 10 == 0) ? 0 : (num/10)+1)));	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
