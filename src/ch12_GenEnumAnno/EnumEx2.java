package ch12_GenEnumAnno;

public class EnumEx2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6); // 0<- Math.random() <6
		
		Lottery lottery = Lottery.values()[num];
		System.out.println(lottery + " 당첨되엇습니다!!!");

	}

}

enum Lottery{
	Kwang, Car, Computer, MobilePhone, Book,Giftcard
}