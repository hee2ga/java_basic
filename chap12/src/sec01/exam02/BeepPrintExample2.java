package sec01.exam02;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask=new BeepTask();
		Thread thread=new Thread(beepTask);
		thread.start(); // run 시작
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시정지
		}
	}

}
