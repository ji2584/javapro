package ch10_Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Pattern 과 r가 속한 패키지
 * 
 * 정규 표현식
 */

public class RegularEx1 {

	public static void main(String[] args) {
		String[] data= {"bat", "baby", "bonus",
						"cA","ca","c.", "c0",
						"car","combat","count","date","disc"};
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자영단어
		
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i] + ",");
			
		}

	}

}
