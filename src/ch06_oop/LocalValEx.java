package ch06_oop;
/*
 * 지역변수 : 메서드 내부에서 선언된 변수.
 * 			반드시 초기화 되어야 한다.
 * 			매개변수는 지역변수다..
 */



public class LocalValEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args: 지역변수
		int num=0 ; //지역변수
		boolean b = true;//지역변수
		if(b) num = 100;
		System.out.println(num);
		String grade;
		int score = 80;//지역 변수
		switch(score/10) {
		case 9 : grade = "A";break;
		case 8 : grade ="B";break;
		case 7 : grade = "C";break;
		case 6 : grade = "D";break;
		default : grade="F";
		
		}
		System.out.println("학점 :" + grade);
	}

}
