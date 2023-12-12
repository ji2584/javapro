package ch11_Collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 정렬 관련 인터페이스
 * Comparable 인터페이스 : 추상메서드 compareTo(Object_
 * 						클래스의 기본 정렬 방식 지정
 * Comparator 인터페이스 : 추상메서드 compare(Object o1, Object o2)
 * 						기본정렬 방식대로 정렬하지않고 사용자가 임의로 정렬 방식을 지정
 * 
 */
public class SetEx4 {

	public static void main(String[] args) {
		System.out.println("나이순으로 출력");
		TreeSet<Person> set = new TreeSet<>(new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.age- p2.age;
			}
		});
		set.add(new Person("홍길동",33));
		set.add(new Person("김삿갓",22));
		set.add(new Person("이몽룡",55));
		System.out.println(set);
		
		System.out.println("이름순으로 출력");
		set = new TreeSet<>(new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return (p1.name.compareTo(p2.name));
			}
		});
		set.add(new Person("홍길동",33));
		set.add(new Person("김삿갓",22));
		set.add(new Person("이몽룡",55));
		System.out.println(set);
				
		
	}

}
