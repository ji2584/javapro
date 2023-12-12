package ch05_Array;

public class arrayex10 {
/*
 * 배열의 복사 : System.arraycopy 메서드를 이용하는 방법
 * System.arraycopy(from array,시작번호 , to array , 시작번호, 복사갯수);
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90,80,70};
		int score2[] = new int[5];
		System.arraycopy(score, 0, score2, 2, score.length);
		
		for(int s : score2) {
			System.out.println(s);
		}
		
		
		

	}

}
