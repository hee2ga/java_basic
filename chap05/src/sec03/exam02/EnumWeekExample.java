package sec03.exam02;
import java.util.Calendar;

import sec03.exam01.Week;

public class EnumWeekExample {
	public static void main(String[] args) {
		
		Week today=null;
		
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)까지의 숫자를 리턴
		
		switch(week) {
		case 1:
			today=Week.SUNDAY; break;
		case 2:
			today=Week.MONDAY;break;
		case 3:
			today=Week.TUESDAY;break;
		case 4:
			today=Week.WEDNESDAY;break;
		case 5:
			today=Week.THURSDAY;break;
		case 6:
			today=Week.FRIDAY;break;
		case 7:
			today=Week.SATURDAY;break;
		}
		System.out.println("오늘 요일 : "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
	}

}
