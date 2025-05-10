package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.sound(); // 멍멍
		cat.sound(); // 야옹
		System.out.println("-----");
		
		Animal animal=null;
		animal=new Dog();
		animal.sound(); // 멍멍
		animal=new Cat();
		animal.sound(); // 야옹
		System.out.println("-----");
		
		animalSound(new Dog()); // 멍멍
		animalSound(new Cat()); // 야옹
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
