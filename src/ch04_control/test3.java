package ch04_control;

import java.util.Scanner;

public class test3 {
	/*
	 * 삼항 연산자를 이용하기
	 * 점수를 입력받아서 90이상이면 "A학점" 80이상이면 "B학점" 70이상이면 "C학점"
	 *              60이상이면 "D학점" 그외는 "F학점" 출력하기
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("점수를 입력하세요");
		 int score = scan.nextInt();
		 
		 System.out.println(score >= 90 ? "A학점" : 
			 					score >= 80 ? "B학점" :
			 						score >=70 ? "C학점" : 
			 							score >=60 ? "D학점" : "F학점" );
		 
		
		
		
		
		
	}

}
