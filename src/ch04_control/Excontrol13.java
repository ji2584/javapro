package ch04_control;

import java.util.Scanner;

public class Excontrol13 {
	/*
	 * 입력받은 숫자가 좌우대칭수인지 판단하기
	 * 숫자를 입력하세요
	 * 121
	 * 좌우대칭수
	 * 123
	 * 좌우대칭수 아님
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str =scan.next();
		boolean chk = true;
		for (int i = 0; i < str.length(); i++) {
			
			/* System.out.println(str.charAt(i)+"="+str.charAt(str.length()-1-i)); */
				
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				chk=false;
				break;
			}
			
		}
		
		if (chk) System.out.println("좌우대칭수");
		else System.out.println("좌우대칭수가 아님");
		
		
		
		

	}

}
