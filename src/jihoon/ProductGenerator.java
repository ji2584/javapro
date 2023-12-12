package jihoon;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ProductGenerator {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] trip = {"동남아","국내여행","유럽","미국","아프리카"};
		int[] cost = {150,250,350,450,550};
		String[] remark = { "안가요","좋아요","보통이에요","너무좋아요"};
		int limit = 0;   int con= 0;
		try {	fos = new FileOutputStream("src/jihoon/triptest.txt");
				ps = new PrintStream(fos);
				
				while(limit++<100) {
					ps.print((int)(Math.random()*12)+1+",");//1 - 12월까지의 여행날
					ps.print(trip[(int)(Math.random()*5)] + ",");//  여행지 
					
					ps.print(remark[(int)(Math.random()*4)] + ",");//평가
					ps.print(cost[(int)(Math.random()*5)] + ",");//가격대
					ps.println();}
				System.out.println("파일 생성 완료");
				ps.flush(); ps.close()  ; fos.close();
				} catch(IOException e) {
					e.printStackTrace();
				
		}

	}

}
