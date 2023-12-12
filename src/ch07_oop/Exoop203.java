package ch07_oop;

public class Exoop203 {
/*
 * Buyer 클래스
 * 멤버변수 : int money = 500, int point =0
 * 			point
 * 			Product[3] cart = new Product[3]; 물건 3개 구매 가능
 * 멤버매서드 : buy(........?)
 * 				p상품의 가격만큼 money 차감.
 * 				p상품의 포인트 만큼 point 증가
 * 				화면에 구입한 제품 출력
 * 				cart에 제품 추가.
 */
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv(100); //100
		Computer com = new Computer(200); //200
		SmartPhone sp = new SmartPhone(150); //150
		b.buy(tv); 		b.buy(com); 	b.buy(sp);
		System.out.println("구매후 잔액:" + b.point);
		System.out.println("=============");
		for (int i = 0; i <b.cart.length; i++) {
			System.out.println(b.cart[i]);
		}}}


class Buyer {
	int money = 500; int point ;
	Product cart[] = new Product[3];
	int cnt;
	
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		System.out.println(p + "구입함");
		cart[cnt++] = p;
	}
	
	
}
