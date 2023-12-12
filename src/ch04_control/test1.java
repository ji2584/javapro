package ch04_control;

import java.util.Scanner;

public class test1 {
	/*
	 * 사과를 사과 상자에 담기로 한다. 1개의 상자에 10개의 사과를 담을 수 있다.
	 * 필요한 사과 상자의 갯수를 출력하기
	 * [결과]
	 * 사과의 갯수를 입력하세요
	 * 22
	 * 필요한 상자의 갯수 : 3
	 *
	 * 사과의 갯수를 입력하세요
	 * 30
	 * 필요한 상자의 갯수 : 3
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		 
		int num = scan.nextInt();
		int box = 0;
		System.out.println("필요한 상자의 갯수" + ":" + (int) Math.ceil(box = num /10  + ((num % 10 == 0) ? 0 : 1)));	
		
		
		
	}

}
