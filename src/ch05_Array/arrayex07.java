package ch05_Array;

public class arrayex07 {
/* 
 * 가변배열 : 다차원 배열에서만 가능함
 * 첫번째 위치는 갯수는 지정을 해야함
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int arr[][] = new int[3][];
		 * arr[0] = new int[]  {10,20};
		 * arr[1] = new int[] {30,40,50};
		 * arr[2] = new int[] {60};  
		 */
		int[][] arr = {{10,20},{30,40,50},{60}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
				
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
