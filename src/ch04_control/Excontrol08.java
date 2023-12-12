package ch04_control;

import java.util.Scanner;

public class Excontrol08 {

	/* 
	 * 화면에 삼각형 높이를 입려갇고, 높이에 맞는 *로 삼각형 출력하기
	 * [결과]
	 * 삼각형의 높이를 입력하세요
	 *	3
	 * *
	 * **
	 * ***
	 *	5
	 *	*
	 *	**	
	 *	***
	 *	****	
	 *	*****
	 *
	 *
	 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int len = scan.nextInt();
		
			for( int i = 1; i<= len; i++) {
				//System.out.println(i);
				for (int j = 1; j <= i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		
		
		
		

	}

}
