package ch06_oop;
/*
 * 오버로딩된 매서드의 선택 기준
 * 1. 호출이 입력된 자료형과 선언부의 선언된 자료형이 동일한 메서드 선택.
 * 2. 1의 조건이 없는 경우
 * 		최소 갯수로 자동형변환이 되는 매개변ㅅ누를 가진 메서드를 선택.
 * 3.주의사항
 * 		최소 갯수로 자동형변환이 되는 매서드가 여러개인 경우 오류 발생
 * 
 * 오버로딩의 조건
 * 1. 매서드의 이름이 같다.
 * 2. 매개변수 목록이 다르다. 
 * 리턴타입, 접근제어자등은 상관없다.
 */
class Math4 { 
	int add(int a, int b) {
		System.out.print("int int 메서드 결과:"); return a+b;	}
	/*
	 * int add(int x, int y){
	 * System.out.print("int int 메서드 결과 :");
	 * return x + y;}
	 */
	long add(long a, int b) {
		System.out.print("long long 메서드 결과:"); return a+b;	}
	long add(long a, long b) {
		System.out.print("long long 메서드 결과:"); return a+b;	}
	
	
	
	
	
	
	
	
}




public class OverloadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math4 m = new Math4();
		System.out.println(m.add(10,10));
		System.out.println(m.add(10,101));
		System.out.println(m.add(101,10));
		System.out.println(m.add(101,101));

	}

}
