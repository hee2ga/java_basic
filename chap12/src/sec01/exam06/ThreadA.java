package sec01.exam06;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("TreadA");
	}
	
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}

}
