package sec02.exam01;

class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}
// D -> B -> A
// E -> C -> A
public class PromotionExample {
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
		A a1=b;
		A a2=c;
		A a3=d;
		A a4=e;
		
		B b1=d;
		C c1=e;
		
		// B b3=e; 상속관계 아님
		// C c2=d; 상속관계 아님
	}
	

}
