package sec05.exam05;

public class Person {
	final String nation="Korea"; // 필드선언 시 초기값 설정
	final String ssn;
	String name;
	
	public Person(String ssn,String name) { // 생성자에서 초기값 설정
		this.ssn=ssn;
		this.name=name;
	}

}
