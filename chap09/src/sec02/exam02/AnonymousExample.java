package sec02.exam02;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony=new Anonymous();
	// 익명 객체 필드 사용
	anony.field.turnOn();
	anony.method1();
	anony.method2(new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("smartTV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("smartTV를 끕니다.");
		}
	});
	
	}
	

}
