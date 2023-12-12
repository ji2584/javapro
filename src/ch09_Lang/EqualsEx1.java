package ch09_Lang;

public class EqualsEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		System.out.println(e1);
		System.out.println(e2);
		if (e1 == e2) { //주소가 다름 : false
			System.out.println("e1과 e2는 같은 객체임");
		} else {
			System.out.println("e1과 e2는 다른 객체임");
		}
		if (e1.equals(e2)) { //value==e.value  value 같음 :true
			System.out.println("e1과 e2는 같은 내용의 객체임");
		}	else {
			System.out.println("e1과 e2는 다른 내용의 객체임");
		}

	}

}
/*
 * Object 클래스
 * equals 메서드 예제: 동등을 정의하는 메서드. -> 오버라이딩 필요.
 * => 같은 객체인지 여부는 == (instance)로 구분이 가능함.
 * => 같은 내용인지 여부는 equals 메서드를 오버라이딩 해야함
 */

class Equal{
	int value; 
	Equal(int value){
		this.value=value;
	}
	//e1.equals(e2)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
		Equal e = (Equal) obj;
		return value==e.value;
		} else {
			return false;
			
		}
	}
}
