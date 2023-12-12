package ch08_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {
 
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("src/ch08_Exception/text.txt"))){
			System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
