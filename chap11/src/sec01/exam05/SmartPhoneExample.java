package sec01.exam05;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone=new SmartPhone("구글", "안드로이드");
		
		String strObj=myPhone.toString();
		System.out.println(strObj); // 구글, 안드로이드
		
		System.out.println(myPhone); // 구글, 안드로이드
	}

}
