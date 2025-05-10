package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone=new Phone(); 불가능 
		SmartPhone smartPhone=new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); // phone의 메소드
	}

}
