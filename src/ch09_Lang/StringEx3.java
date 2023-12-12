package ch09_Lang;

public class StringEx3 {
//concat,endswith, startwith, equalsIgnoreCase , index of
//lastIndexof,length,replace,substring,toLowercase,toUpperCase,trim  
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); //E,5번쨰문자리턴
		//정렬관련 메서드. "ABCDEFGH" - "abc": 65-97 =-32
		System.out.println(s.compareTo("abc"));//-32
	}
 
}
