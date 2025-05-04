package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode=System.in.read();
			System.out.println("keyCode : "+keyCode);
			if(keyCode==113) { // q입력시 종료
				break;
			}
		}
		System.out.println("종료");
	}

}
