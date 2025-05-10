package sec01.exam06;

public class Button {
	OnClickListener listener; 
	
	void setOnClickListener(OnClickListener listner) {
		this.listener=listner;
	}
	
	void touch() {
		listener.Onclick();
	}
	static interface OnClickListener{
		void Onclick();
	}

}
