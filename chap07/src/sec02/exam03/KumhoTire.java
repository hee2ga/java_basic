package sec02.exam03;

public class KumhoTire extends Tire {

	public KumhoTire(String loction, int maxRotation) {
		super(loction, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location+" kumhoTire 수명 : "+(maxRotation-accmulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" kumhoTire 펑크 ***");
			return false;
		}
	}

}
