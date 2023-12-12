package ch04_control;

public class Loopex4 {
	/* 그외 제어문
	 *  break 	: 반복문이나 switch 구문
	 *  contine : 반복문의 처음으로 제어를 이동
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 2; i <= 9; i++) {
			 System.out.println("\n" + i + "단");
		
			for (int j = 2; j <= 9; j++) {
				
				//if(j==5) break;
				if (j==5) continue;
				System.out.println(i +"*"+ j+"="+(i*j));
			}
		}
		
	}

}
