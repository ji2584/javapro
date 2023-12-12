package ch05_Array;

import java.util.Arrays;

public class arrayex11 {
/* 
 * 배열의 복사 : Arrays: 클래스 이용하기
 * int[] Arrays.copy01(int[] original, int newlength]
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1[] = {90,80,70};
		int score2[] = Arrays.copyOf(score1, 5);
		
		for(int s : score2) {
			System.out.println(s);
		}
		System.out.println("Arrays.toString(score2)");
		System.out.println(Arrays.toString(score2));
		
		
		

	}

}
