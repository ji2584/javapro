package ch05_Array;

import java.util.Scanner;

public class test2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = scan.nextInt();
		
		int start= 1;
		int end = (num * 2 -1);
		for (int i = 1; i <= (num * 2 - 1); i++) {
			for(int j = 1; j <= (num * 2 - 1); j++) {
				System.out.print((start <= j && end >= j )? "*" : " ");
			}
			
			if (i < num) {
				start ++;
				end--;
			}
			else {
				start--;
				end++;
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
