package sec02.verify.exam02;
import java.util.*;

public class Exam02 {
	public static void main(String[] args) {
	Calendar now=Calendar.getInstance();
	
	int year=now.get(Calendar.YEAR);
	
	int month=now.get(Calendar.MONTH)+1;
	String strMonth=null;
	if(month<10) {
		strMonth="0"+month;
	}else {
		strMonth=String.valueOf(month);
	}
		
	int day=now.get(Calendar.DAY_OF_MONTH);
	String strDay=null;
	if(day<10) {
		strDay="0"+day;
	}else {
		strDay=String.valueOf(day);
	}
	
	int week=now.get(Calendar.DAY_OF_WEEK);
	String strWeek=null;
	
	switch(week) {
		case Calendar.MONDAY:
			strWeek="월";
			break;
		case Calendar.TUESDAY:
			strWeek="화";
			break;
		case Calendar.WEDNESDAY:
			strWeek="수";
			break;
		case Calendar.THURSDAY:
			strWeek="목";
			break;
		case Calendar.FRIDAY:
			strWeek="금";
			break;
		case Calendar.SATURDAY:
			strWeek="토";
			break;
		default:
			strWeek="일";
	}
	
	int hour=now.get(Calendar.HOUR);
	int amPm=now.get(Calendar.AM_PM); // 0 : 오전 1 :오후
	String strHour=null;
	if(amPm==1) { // 오후일 경우
		hour=hour+12;
		strHour=String.valueOf(hour);
		
	}else {
		strHour="0"+hour;
	}
	
	int minute=now.get(Calendar.MINUTE);
	String strMin=null;
	if(minute<10) {
		strMin="0"+minute;
	}else {
		strMin=String.valueOf(minute);
	}
	
	
	System.out.println(year+"년 "+strMonth+"월 "+strDay+"일 "+strWeek+"요일 "+strHour+"시 "+strMin+"분");
	
}
}
