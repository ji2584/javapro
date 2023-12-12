package ch12_GenEnumAnno;

public class GenericEx1 {

	public static void main(String[] args) {
		Pool01 gen =new Pool01();
		gen.set("그랜저"); //object <===== String type
		String name = (String)gen.get();
		System.out.println(name);
		gen.set(new MyClass01());// Object<==== MyClass type
		MyClass01 g = (MyClass01)gen.get();
// 		String g2 = (String) gen.get();
		System.out.println(g);	}}
/*
타입을 정하지 않은 변수를 Pool01 class의 멤버로 구현한다
*/
class MyClass01{

	@Override
	public String toString() {
		
		return "MyClass01";
	}
}
class Pool01 {
	private Object object;
	public void set(Object object) {
		this.object = object;}
	public Object get() { return object;}
	
	
} 
   