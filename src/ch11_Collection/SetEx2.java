package ch11_Collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 30));
		set.add(new Person("이정민",10));
		set.add(new Person("김윤민",16));
		print(set);
		System.out.println("=======   =======");
		Person p1 = new Person("김삿갓",20);
		Person p2 = new Person("김삿갓",20);
		p2=p1;
		set.add(p1);		set.add(p2);		print(set);
	}
		public static void print(Set li) {
			for(Object ob : li) { System.out.println(ob);
			}
		}
	}

