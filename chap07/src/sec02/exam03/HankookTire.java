package sec02.exam03;

public class HankookTire extends Tire{

	public HankookTire(String loction, int maxRotation) {
		super(loction, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location+" HankookTire 수명 : "+(maxRotation-accmulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
	}
	

}
