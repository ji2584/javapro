package ch14_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx14 {

	public static void main(String[] args) {
		Student2[] stuarr= {
	              new Student2("김길동",1,89,56,66),
	            new Student2("김삿갓",1,85,88,80),
	            new Student2("김삿갓",1,80,88,80),
	            new Student2("김삿갓",1,90,88,80),
	            new Student2("이몽룡",2,90,78,95),
	            new Student2("임꺽정",3,60,56,88),
	            new Student2("임꺽정",1,90,72,72)
		};
		
		System.out.println("1.학생 이름만 뽑아서 List<String>에 저장한다.");
		List<String>names =
				Stream.of(stuarr)
				.map(Student2::getName)
				.collect(Collectors.toList());
		
		
		System.out.println(names);
		
		System.out.println("2.학생 이름만 뽑아서 	String[]에 저장한다.");
		String[]arrnames=
				
				Stream.of(stuarr)
				.map(Student2::getName)
				.toArray(String[]::new);
				
		System.out.println(Arrays.asList(arrnames));
		
		
		
		System.out.println(names);
		
		
		

	}

}
