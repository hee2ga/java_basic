package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child=new Child();
		
		Parent parent=child;
		parent.method1();
		parent.method2(); // 재정의된 메소드 호출
		// parent.method3(); // 자동타입변환후 부모 필드 메소드만 접근가능
	}

}
