package ch04_control;

import java.util.Scanner;

public class Excontrol02 {
/*
 * 키보드에서 한개의 문자를 입력받아서 대문자, 소문자, 수사, 기타문자인 출력하기
 * scan. next(0).charAt(0);
 * [결과]
 * 한개의 문자를 입력하세요
 * A
 * 대문자 ('A' <= ch <= 'Z')
 * 한개의 문자를 입력하세요 
 * c
 * 소문자 ('a' <= ch <= 'z')
 * 한개의 문자를 입력하세요 
 * 3 
 * 숫자 ('0' <= ch <= '9')
 * 한개의 문자를 입력하세요
 * -
 * 기타문자 : 그외.
 * 
 * 
 */
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			System.out.println("문자를 입력하세요");
			char ch = scan.next().charAt(0);
			
			if('A' <= ch && ch <= 'Z') {
				System.out.println("대문자");
			} else if ('a' <= ch && ch <= 'z') {
					System.out.println("소문자");
			} else if ('0' <= ch && ch <= '9') {
				System.out.println("숫자");
			} else {
				System.out.println("기타문자");
				
			}
			
		
		
		
		

	}

}
