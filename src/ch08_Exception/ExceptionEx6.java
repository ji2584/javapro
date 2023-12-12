package ch08_Exception;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			badmethod();//1.
			
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");//7.
			e.printStackTrace();//8.
		}

	}
	private static void badmethod() throws Exception{//6.
		try {
			throw new Exception("예외 강제 발생");//2.예외 발생
		} catch (Exception e ) {
			System.out.println("badmethod 에서 예외 처리");//3.
			e.printStackTrace();//4.
			throw e; //예외 재발생//5.
		}
	}

}
