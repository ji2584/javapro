package ch08_Exception;

class ResourceTry {

	public static void main(String[] args) {
		//jdk.1.7 이상 사용가능
		
		try (AutoCloseable cr = new AutoCloseableUse()) {
			System.out.println("process");
		}	System.out.println();
			
				
			
		}// main의 끝

	}
class AutoCloseableUse implements AutoCloseable{
	
	public void close() {
		System.out.println("close()가 호출됨 ===");
	}
}


