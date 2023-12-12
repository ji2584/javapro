package ch09_Lang;
/*
 * String : (jdk 제공객체)은 equals(), hashCode()를 오버라이딩함
 */

public class HashCodeEx1 {

	public static void main(String[] args) {
		Value v1 = new Value("abc",100);
		Value v2 = new Value("abc",200);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
	}

}
class Value {
	String value;
	int num;
	Value(String value,int num) { this.value=value;
	this.num=num;}
	
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Value) {
				Value v = (Value)obj;
				return value==v.value;
			} else { 
			return false;
		}
}
	@Override
		public int hashCode() {
			
			return value.hashCode()+num;
		}
}
