package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	public D() { // 다른패키지에 존재하지만 상속관계이므로 접근가능
		super();
		this.field="value";
		this.method();
	}

}
