package ch09_Lang;

public class StringEx2 {
	/*
	 *  String은 값의 대입에 따라 주소가 설정됨
	 *  str의 주소가 값의 입력에 따라 바뀐다
	 */

	public static void main(String[] args) {
		String str = "ABC"; //리터럴 값 대입시
		String str1 = "ABC";
		System.out.println("1)str hashcode():" + System.identityHashCode(str)+
				System.identityHashCode(str1));
		System.out.println("main :" + str);
		change(str); //주소 설정하지않음
		System.out.println("2)str hashcode():" + System.identityHashCode(str)
				+ System.identityHashCode(str1));
		System.out.println("change 이후 main 재설정 안함" + str);
		
		str = change(str);//주소 재설정
		System.out.println("3)str 주소 재설정 hashcode" + System.identityHashCode(str)
				+ System.identityHashCode(str1));
		System.out.println("change 이후 main-재설정:" + str);
	}
	
	static String change(String str) {
		str +="456"; //주소가 변경 된다
		System.out.println("change() s :" + str + ":" +System.identityHashCode(str));
		return str;
	}
	
}
