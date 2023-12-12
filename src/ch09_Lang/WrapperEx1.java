package ch09_Lang;
/*
 * 지정된 Wrapper 클래스와 기본자료형 사이에는 자동 형변한이 가능하다.
 * 이것을 우리는 박싱과 언박싱이라 한다.
 * 다른타입의 언박싱은 가능(기본형 타입의 오토캐스팅 조건)
 * 다른 타입의 박싱은 불가함
 * equals,hashcode,tostring 모두 오버라이딩 되어있음
 * compareto 오버라이딩
 */

public class WrapperEx1 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		int iii = i; //Unboxing
		double d = (int)i;
		float f =i;
		short s =(short)(int)i;
		Double d2 = (double)(int)i;
		
		Double d3 = d;//Boxing
		System.out.println("i==i2 ?"+(i==i2));
		System.out.println("i.equals(i2) ? "+ i.equals(i2));
		System.out.println("i.compareTo(i2) ? "+ i.compareTo(i2));
		System.out.println("i.toString(i2) ? "+ i.toString(i2));
		System.out.println("MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("SIZE=" + Integer.SIZE);
		System.out.println("BYTES=" + Integer.BYTES);
		System.out.println("TYPE=" + Integer.TYPE);
	}

}
