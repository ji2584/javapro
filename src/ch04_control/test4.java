package ch04_control;

import java.util.Scanner;

public class test4 {

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력수보다 크거나 같은 가장 작은 10의 배수를 구하기
 * 10의배수에 입력수를 뺀 값을 출력하기 : 
 * [결과]
 * 10부터 99까지의 수를 입력하세요
 * 24
 * 30 - 24 = 6
 * 
 * 10부터 99까지의 수를 입력하세요
 * 20
 * 20 - 20 = 0
 * 
 * 10부터 99까지의 수를 입력하세요
 * 77
 * 80 - 77 = 3
 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int num2 =  (num%10==0) ? num : ((num/10+1)*10);
		
		System.out.println(num2 + "-" + num + "=" + (num2-num));
		
		
		

	}

}
