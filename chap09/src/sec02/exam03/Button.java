package sec02.exam03;

public class Button {
	OnClickListener listener;
	
	public void setClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.Onclick();
	}
	
	static interface OnClickListener{
		void Onclick();
	}

}
