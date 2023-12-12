package ch09_Lang;

public class CloneEx1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point original = new Point(3,5);
	
		Point copy = (Point) original.clone(); //복제 해서 새로운 객체를 생성
		copy.y=999;
		System.out.println(original);
		System.out.println(copy);

	}

}

class Point implements Cloneable {
	
	int x; int y;
	public Point(int x, int y) { 
		super();
		this.x=x;  this.y = y;	}
	
	protected Object clone()  {
		try {
		return super.clone();
	} catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}
		return null;}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
