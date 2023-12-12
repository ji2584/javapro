package ch14_Stream;

import java.util.stream.Stream;

public class StreamEx04 {

	public static void main(String[] args) {
		Stream<String>strArrstrm = Stream.of(
				"abc","def","jkl","ABC","GHI","JKL");
		strArrstrm
		.filter(s-> s.compareTo("a")>0)
		.forEach(s -> System.out.println(s));

	}

}
