package sec02.exam04;

public class PrintThread4 extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break; // interrupt()가 호출되었다면 while문 빠져나옴
			}
		}
		
		System.out.println("자원정리");
		System.out.println("실행 종료");
	}
	

}
