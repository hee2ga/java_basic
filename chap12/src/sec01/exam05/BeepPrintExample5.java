package sec01.exam05;
import java.awt.Toolkit;
public class BeepPrintExample5 {
	public static void main(String[] args) {
		Thread thread=new Thread() {
			@Override
			public void run() {
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시정지
				}
			}
		};
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시정지
		}
	}

}
