package ch05_Array;

public class arrayex09 {
	/*
	 * 배열의 복사 : for 구문을 이용하여 배열 복사하기
	 * 
	 * 한번 생성된 배열 객체는 크기 변경이 안됨
	 * 
	 * =>Collection 의 List 객체는 변경 가능
	 * 
	 * 
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90,80,70};
		//socre.length = 5; //error. 배열의 크기 변경 안됨
		int score2[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			score2[i] = score[i];
			
		}		
		for(int s : score2) {
			System.out.println(s);
		}
		

	}

}
