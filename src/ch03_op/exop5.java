package ch03_op;

import java.util.Scanner;

public class exop5 {
/*
 * 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하여 출력하기
 * 소문자가 아닌 경우는 "소문자아님" 출력하기
 *  char ch = str.charat(0);
 *  ch 범위 : 	"n"<= ch <='z'
 *  대문자 = 소문자-32;
 *  [결과]
 *  한개의 문자를 입력하세요
 *  a
 *  A
 *  
 *  한개의 문자를 입력하세요
 * 1 
 * 소문자아님
 * 
 * 
 * 
 * 
 * 
 * ('b'<'a')	false : 'a'+1은 'b'임 65
 * int s = 'A';
 * system.out.println('a'-'A');
 * 
 * 
 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("한개의 문자를 입력하세요");
			Scanner scan = new Scanner(System.in);
			String str = scan.next(); //문자열로 입력받기
			char ch = str.charAt(0); // 문자열중 첫번째 문자
			System.out.println(('a'<= ch && ch <='z') ? (char)(ch-32) : "소문자아님" );
			
			
	}

}
