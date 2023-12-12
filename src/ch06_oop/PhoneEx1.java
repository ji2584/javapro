package ch06_oop;

public class PhoneEx1 {
/*
 * 클래스 : 사용자 정의 자료형.
 * 속성 : 멤버 변수
 * 기능 :   멤버에서도
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Phone p1; => 참조변수 선언
			//new phone() => 객체 생성. 객체화, 인스턴스화
			//new 예약어 : 객체 생성 기능. 메모리 할당함.
			//String 을 제외한 모든 클래스의 객체 생성은 new 연산자로 가능함
		
		Phone p1 = new Phone();
		p1.color = "검정";	 p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01012345678");
		p1.receive("01012345678");
		
		Phone p2 = new Phone();
		/*
		 * new 예약이 가능
		 * 1. 힙영역에 메모리 할당
		 * 2. 멤버변수를 기본값으로 초기화 기본값 : 숫자 : 0, boolean : false, 그외 :
		 * 3.생성자 호출 기능
		 * 
		 */
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2=p1;
		/*
		 * p1 객체와 p2 객체는 같은 객체임
		 * 하나의 객체는 두개의 참조변수가 참조가 가능함
		 * 하나의 참조변수가 두개의 객체는 참조 불가능함
		 */
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		
		
	}

}
