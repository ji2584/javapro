package ch04_control;

public class Excontrol07 {
	
	
	/*
	 * (1) + (1+2) + (1+2+3)+.....(1+2+3+...+10)=220 출력하기
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		
		for(int i = 1; i <=10; i++)//row정하기 
			{ System.out.print("(");
			for (int j =1; j<=i; j++)//col정하기
				{
				sum +=j;
				System.out.print(j+(i==j?"":"+"));
			}
						System.out.print(")" +(i==10?"=":"+"));
		}
		System.out.println(sum); 
		
		
		
		

	}

}
