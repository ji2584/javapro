package ch12_GenEnumAnno;

public class GenericEx2 {

	public static void main(String[] args) {
		Pool02<String> gen =new Pool02<>();
		
		gen.set("그랜저"); //object <===== String type
		String name = (String)gen.get();
		 System.out.println(name);
		Pool02<MyClass02> gen1 =new Pool02<MyClass02>();
		gen1.set(new MyClass02());// Object<==== MyClass type
		//MyClass02 g = (MyClass02)gen.get();
// 		String g2 = (String) gen.get();
		MyClass02 g = gen1.get();
		System.out.println(g);	

		Pool02<Integer> gen2 = new Pool02<Integer>();
		gen2.set(300);
		int num = gen2.get();
		System.out.println(num);}}
		
/*
타입을 정하지 않은 변수를 Pool01 class의 멤버로 구현한다
*/
class MyClass02{

	@Override
	public String toString() {
		
		return "MyClass01";
	}
}
class Pool02 <T> {
	private T t;
	public void set(T t) {
		this.t = t;}
	public T get() { return t;}
	
	
}
