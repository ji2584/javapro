package ch07_Inter;
/*
 *  final 변경불가.
 *  final method : 재정의 불가. 오버라이딩 불가 메서드.
 */

public class FinalMethod {
	final void FinalMethod() {
		System.out.println("finalMethod 오버라이딩 불가");
	}

}

class SubMethod extends FinalMethod {
	void FinalMethod() {
		System.out.println("finalMethod 오버라이딩 불가");
	}
}
