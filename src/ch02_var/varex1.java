package ch02_var;

public class varex1 {
/*
 * 실수형 리터럴의 기본자료형은 duble
 * float리터럴로 표시하기 위해서는 접미사를 붙여하한다.
 * F,f : float 리터럴
 * D,d : double 리터럴
 * L,l : long 리터럴
 * 
 * 자료형
 * 		기본형 -논리형 : boolean(1bit)
 * 		      문자형 : char(2)
 * 			  정수형 : byte(1), short(2), int(4) long(8)
 * 			  실수형 : float(4), double(8)
 * 		참조형 - 배열, 클래스, 인터페이스
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수의 선언 및 초기화
				byte b1 = -22;
				byte b2; //변수의 선언, b2 저장공간 메모리 1바이트(8bit)할당,
				//바이트로 저장할 수 있는 값의 범위. -128 ~ 127 저장가능
				//정수 리터럴은 기본 int//
				b2= -128; // 변수의 초기화
				b1= 127;
				
				short s1 = -220; //2 byte 16bit
				int il = 100; // 4byte 32bit
				long l1 = 1000; // 8 byte 64bit auto castiing
				//변수값 내용을 화면에 출력하기 
				//system.out.println : 화면에 값을 출력
				int i2 = (int) l1; 
				System.out.println("b1="+ b1); // b1=-22
				System.out.println("s1="+ s1);
				System.out.println("il="+ il);
				System.out.println("l1="+l1);
				//실수 리터럴은 기본 double
				float f1 = (float) 1.0F; //float
				  f1 = l1;
				  double d1 = 1.0;
				  double d12 = l1;
				  
				  System.out.println("f1=" + f1);
				  System.out.println("d1=" + d1);
				 
		
							
	} //main end
	


	
}//end class
 
