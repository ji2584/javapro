package ch14_Lambda;

import java.util.Iterator;

public class LambdaEx2 {

	public static void main(String[] args) {
		System.out.println("main 시작");
		//run()
		Runnable r = () -> {
			int sum = 0;
			for (int i = 0; i < 100; i++) {
				sum+= i;
				
			}
			System.out.println("1부터100까지의 합:" + sum);};
			
		Thread t = new Thread(r);
		Thread t2 = new Thread(()-> {
			int sum = 0;
			for (int i = 0; i < 100; i++) {
				sum+=i;				
			}
			System.out.println("******1부터 100까지의 합2:" + sum);
			});
		
		t.start();  t2.start();
		System.out.println("main 종료");
		
		}

}
