package sec02.exam01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않습니다.");
		}
	}

}
