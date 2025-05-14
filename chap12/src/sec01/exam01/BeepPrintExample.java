package sec01.exam01;
import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) { // 비프음 발생시킨 후 띵 출력
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시정지
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시정지
		}
	}

}
