package sec01.exam08;

class Car{}

public class ClassExample {
	public static void main(String[] args) throws Exception{
		// 첫번째 방법
		Class clazz1=Car.class;
		
		// 두번째 방법
		Class clazz2=Class.forName("sec01.exam08.Car");
		
		// 세번째 방법
		Car car=new Car();
		Class clazz3=car.getClass();
		
		System.out.println(clazz1.getName()); // sec01.exam08.Car
		System.out.println(clazz1.getSimpleName()); // Car
		System.out.println(clazz1.getPackage().getName()); // sec01.exam08
	}

}
