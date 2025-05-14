package sec01.exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { // 값 저장
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2초간 일시정지
		}catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		
	}

}
