package sec02.exam03;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); // InterruptedException 발생 catch로 이동
			}
		}catch (InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
