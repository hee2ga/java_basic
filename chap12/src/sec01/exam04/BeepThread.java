package sec01.exam04;
import java.awt.Toolkit;

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시정지
		}
	}
	
}
