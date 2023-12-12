package ch15_io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {

	public static void main(String[] args) {
	
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("src/ch15_io/test.dat", "rw");
			System.out.println("파일 포인터의위치: " + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("파일 포인터의위치: " + raf.getFilePointer());
			raf.writeLong(100L);
			System.out.println("파일 포인터의위치: " + raf.getFilePointer());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
