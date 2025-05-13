package sec01.verify.exam08;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1=100;
		Integer obj2=100;
		Integer obj3=300;
		Integer obj4=300;
		
		// 값의 범위가 -128 ~ 127 이면 == 는 값비교 ,그이외에는 번지비교
		System.out.println(obj1==obj2); // 값 비교 : true
		System.out.println(obj3==obj4);  // 번지 비교 : false
	}

}
