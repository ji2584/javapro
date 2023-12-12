package ch05_Array;

public class Exarray03 {
	/*
	 * 1 ~ 10 사이의 임의의 수 100개를 만들어서
	 * 각수마다 나온 횟수만큼 '*' 를 프린트하세요
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		
		
		for(int i=0; i<100;i++) {
			int temp = (int)(Math.random() *10+1);
			arr[temp-1]++;
		}
		
		for(int j=0 ; j < 10; j++) {
			System.out.print(j + ":" +arr[j]+"-");
			
			for(int i=0; i<arr[j];i++) {
				System.out.print("*");
			}
			System.out.println();

	}

	}
}