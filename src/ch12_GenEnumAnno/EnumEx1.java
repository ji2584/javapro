package ch12_GenEnumAnno;

enum Direction1 {EAST,SOUTH,WEST,NORTH}
/*
 * Enum(열거형):
	Enum은 상수 값을 나타내는 데 사용됩니다.
	Enum은 관련된 상수 값을 그룹화하고 명명하는 데 유용합니다.
	Enum은 타입 안전성을 제공하며, 잘못된 값이 사용되는 것을 방지합니다.
	Enum은 유한한 집합의 상수를 나타낼 때 주로 사용됩니다. 예를 들어, 요일, 상태, 타입 등을 열거하기에 적합합니다.
	Enum 요소는 기본적으로 정수 값으로 표현되며, 요소 간의 비교나 스위치 문에서 사용됩니다.
	
	String name()	: 열거형 상수의 이름을 문자열로 리턴
	int ordinal()	: 열거형 상수가 정의된 순서를 리턴(1부터 시작)
	valueOf(String name) : [지정된 열거형에서] name 과 일치하는 열거형 상수를 표현
	values()		: 열거형 상수들을 배열 형태로 리턴

 */

public class EnumEx1 {

	public static void main(String[] args) {
		Direction1 d1 = Direction1.EAST;
		Direction1 d2 = Direction1.valueOf("WEST");
		Direction1 d3 = Enum.valueOf(Direction1.class, "EAST");
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		System.out.println("d1=d2" + (d1==d2));
		System.out.println("d1=d3" + (d1==d3));
		System.out.println("d1.equals(d3)? " + d1.equals(d3));
//		System.out.println("d2>d3 ?" + (d1>d3));//에러
		System.out.println("d1.compareTo(d3)? " + d1.compareTo(d3));
		System.out.println("d1.compareTo(d2)? " + d1.compareTo(d2));
		System.out.println("====================");
		
		switch(d1) {
		case EAST: // Direction1.EAST라고 쓸수없다.
			System.out.println("The direction is EAST."); break;
		case SOUTH:
			System.out.println("The direction is SOUTH."); break;
		case WEST:
			System.out.println("The direction is WEST."); break;
		case NORTH:
			System.out.println("The direction is NORTH."); break;
		default : 
			System.out.println("Invalid Direction."); break;
		
		}
		
		Direction1[]dArr = Direction1.values();
		for(Direction1 d : dArr)//for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		
		
		
		
		
		
	}

}
