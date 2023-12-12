package ch03_op;

import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char             a='a';       //A. OK
//	    char             b="a";       //B. char <= String  저장 안됨. X
	    String          c="a";       //C. OK
//	    String          d='a';       //D. String <= char  저장 안됨. X
//	    char             e='ab';      //E. 문자형은 한개의 문자만 가능  X
	    String          f="ab";      //F. OK
//	    char g = '';                //G 문자형은 한개의 문자만 가능  X
	    String h = "";              //H OK

	}

}
