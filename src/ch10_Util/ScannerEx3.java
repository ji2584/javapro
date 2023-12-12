package ch10_Util;

import java.io.File;

import java.util.Scanner;


public class ScannerEx3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/ch10_Util/score.txt"));
		int sum = 0;
		int cnt = 0;
		while (sc.hasNext()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			//System.out.println(line);
			//String[]stu = line.split(",");
			System.out.print(sc2.next() + ":");
			sum=0; cnt=0;
			while(sc2.hasNextInt()){
				int num = sc2.nextInt();
				sum+=num;
				System.out.print(num + " ");
				++cnt;
			}
			
			
			System.out.println(sum + " " + (double) sum/cnt);
		}
	
		
		
		
	}

}

