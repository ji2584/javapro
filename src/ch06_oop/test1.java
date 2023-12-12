package ch06_oop;

import java.util.Scanner;

/* 
 * 1에서 9까지의 숫자를 입력하세요 끝내려면 -1 입력하세요.
 * 
 * 입력값 : 1234
 * 숫자 *로 표현하기
 */
public class test1 {
	

	public static void main(String[] args) {
	    
		String neonNumber[][] = { 
				{ "*****", "*   *", "*   *", "*   *", "*****" },//0
	            { " **  ", "  *  ", "  *  ", "  *  ", " *** " },//1
	            { "*****", "    *", "*****", "*    ", "*****" },//2
	            { "*****", "    *", "*****", "    *", "*****" },//3
	            { "  ** ", " * * ", "*  * ", "*****", "   * " },//4
	            { "*****", "*    ", "*****", "    *", "*****" }, //5
	            { "*****", "*    ", "*****", "*   *", "*****" },//6
	            { "*****", "*   *", "*   *", "    *", "    *" },//7
	            { "*****", "*   *", "*****", "*   *", "*****" },//8
	            { "*****", "*   *", "*****", "    *", "    *" } };//9
		String temp = " ";
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1에서 9까지의 숫자를 입력하세요." + " 끝내려면 -1 입력하세요.");
			temp = scan.next();
			if(temp.equals("-1")) {
				System.out.println("end");
				break;
			}
			System.out.println("입력값 : " + temp);
			
			for(int i = 0 ; i<5; i++) {
				for(int j = 0; j<temp.length(); j++) {
					int index = temp.charAt(j)-'0';
					System.out.print(neonNumber[index][i] + "\t");
				}
				System.out.println();
			}
			
		}
		
		
		
		
		
		
	}

}
