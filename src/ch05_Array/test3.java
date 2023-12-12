package ch05_Array;

import java.util.Scanner;

public class test3 {
/*
 * 입력된 수 보다 작은 솟수를  프린트 하세요
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 수를 입력하세요");
		int num = scan.nextInt();
		for (int i=2; i < num; i++) {
			boolean chk = true;
			for (int j = 2; j <i; j++) {
				if (i%j == 0) {
					chk = false;
					break;
				}
			}
			if(chk)
				System.out.print(i + " ");
			
		}
		
		
		
		
	}

}
