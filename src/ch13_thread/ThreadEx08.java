package ch13_thread;



/*
 * 생산자 스레드,소비자스레드 예제
 * 
 * 엄마와 아들은 하나의 계좌를 공유한다.
 * 계좌에 잔액이 0이면 아들은 wait() 상태로 변경되고, 엄마는 계자에 잔액이 있으면 wait() 상태로
 * 엄마는 잔액이 0원이면 10000,20000,30000 원 중 한개만 입금한다
 * 엄마() 0~3000(3초)동안 sleep
 * 아들() 0~1000(1초)동안 sleep
 */
class Account {
	int money;
	synchronized void output() {
		while(money==0) {
			try {
				wait(); //son.스레드 대기
			} catch(InterruptedException e) {}
		}
			notifyAll(); //wait() 삳ㅇ태인 스레드 모두 Runnable 상태로 변환
			System.out.println(Thread.currentThread().getName()+ ":"+money+"원 출금");
			money = 0;
	}
	
	
	synchronized void input() {
		while(money>0) {
			try {
				wait(); //mother 스레드 대기
			} catch(InterruptedException e) {}
		}
			money= ((int)(Math.random()*3) +1)*10000;
			//System.out.println(money);
			notifyAll(); //wait() 삳ㅇ태인 스레드 모두 Runnable 상태로 변환
			System.out.println(Thread.currentThread().getName()+ ":"+money+"원 입금");
		
	
	
}

}

class Mother extends Thread{
	Account account;
	Mother(Account account) {
		super("엄마스레드");
		this.account=account;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int)(Math.random()*3000));//0~3초동안 임의로 sleep
			} catch (InterruptedException e) {}
			
		}
	}
}





class Son extends Thread {
	Account account;
	Son(Account account) {
		super("아들스레드");
		this.account =account;
	}
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {}
		}
	}
}



public class ThreadEx08 {

	public static void main(String[] args) {
		 
			Account acc = new Account();
			Thread mother = new Mother(acc);
			Thread son = new Son(acc);
			son.start();mother.start();
			

	}

}

