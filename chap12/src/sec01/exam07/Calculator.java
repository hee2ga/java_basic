package sec01.exam07;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) { // 계산기에 값을 저장하는 메소드
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2초간 정지
		}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		
	}

}
