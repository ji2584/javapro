package ch04_control;

import java.util.Scanner;

public class excontrol14 {
/*	200 - 399 : 새우깡
 * 	400 - 599 : 핸드폰
 *  600 - 799 : 자동차
 *  800 - 999 : 아파트
 *  
 *  850 : 아파트, 자동차, 핸드폰, 새우깡
 *  730 : 자동차 핸드폰, 새우깡
 *  160 : 상품이 없습니다.
 * 
 * 
 * 
 */
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("포인트를 입력하세요(1 ~ 10000 exit(9999)");
		int point = 0;
		
		while(true) {
			point = scan.nextInt();
			if (point==9999) break;
				switch(point/200) { 
				case 0: System.out.println("상품이 없습니다"); break;
				case 4: System.out.println("아파트");
				case 3: System.out.println("자동차");
				case 2: System.out.println("핸드폰");
				case 1: System.out.println("새우깡");
				
				}
			}
		}
		
		
		

	}

