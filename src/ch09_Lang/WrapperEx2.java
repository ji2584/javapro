package ch09_Lang;

public class WrapperEx2 {

	public static void main(String[] args) {
		int is = Integer.parseInt("123");
		System.out.println(is);//123
		is= Integer.parseInt("123",8);//123 8진수로 인식해서 10진수로 수정
				System.out.println(is);
		is= Integer.parseInt("123",16);//123 16진수로 인식해서 10진수로 수정
				System.out.println(is);
				
		float f = Float.parseFloat("123.45");
		System.out.println(f);//123.45
		f = Float.parseFloat("123.45f");
		System.out.println(f);//123.45
		double d = Double.parseDouble("123.45");
		System.out.println(d);
		
		
		System.out.println(Integer.toBinaryString(500));//십진수를 다른 진수로 사용
		System.out.println(Integer.toOctalString(500));
		System.out.println(Integer.toHexString(500));
		
		
		
	}

}
