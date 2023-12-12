package ch14_Stream;

import java.util.Arrays;
import java.util.List;
/*
 * 람다식												메소드 참조
 * static 메소드 : a -> 클래스이름.메소드(a)				클래스이름::메소드이름
 * 인스턴스 메소드 : (a,b)-> a.메소드(b)					클래스이름::메소드이름
 * 				(a) -> 객체.메소드(a)					클래스이름::메소드이름
 * 
 * 생성자(a)		:	new 생성자(a)						생성자이름::new
 * 배열 생성자 (a)	:	new 타입[a]						타입::new
 */

class Member{
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int gender;
	private int age;
	public Member(String name, int gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
public class StreamEx06 {

	public static void main(String[] args) {
		List<Member>list = Arrays
							.asList(new Member("홍길동",Member.MALE,30),
									new Member("김나리",Member.FEMALE,20),
									new Member("신용권",Member.MALE,45),
									new Member("박수미",Member.FEMALE,27));
		
		double ageAvg = 
				list.stream()
				.filter(m -> m.getGender() == Member.MALE)
			  //.mapToInt(Member::getAge) //method reference
				.mapToInt(s-> s.getAge())
				.average()
				.getAsDouble();
		System.out.println("남자 평균 나이:" + ageAvg );

	}

}
