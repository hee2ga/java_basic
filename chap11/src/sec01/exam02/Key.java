package sec01.exam02;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key=(Key)obj;
			if(this.number==number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}

}
