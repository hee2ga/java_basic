package sec02.exam03;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread=new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);}catch (InterruptedException e) {}
		
		thread.interrupt(); // 스레드를 종료하기위해 InterruptedException 발생시킴
	}

}
