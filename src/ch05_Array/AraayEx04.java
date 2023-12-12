package ch05_Array;

public class AraayEx04 {
	/*
	 * command 라인에서 파라미터 받기
	 * javac ArrayEx6.java
	 * c:\aaa\> java arrayex6 홍길동 김삿갓 aaa bbb
	 * 우클릭 ---< run as ---> run configuration --> tab : arguments
	 */
	

	public static void main(String[] args) {//String args[]
		// TODO Auto-generated method stub
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("커맨드라인에 파라미터를 입력하세요");
			System.out.println("java ch05_array.ArrayEx4 홍길동 김삿갓 aaa bbb");
			return;
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"]="+args[i]);
			
		}
		
		

	}

}
