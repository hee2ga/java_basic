package sec02.verify.exam01;
import java.util.*;
import java.text.*;
public class Exam01 {
	public static void main(String[] args) {
		Date now=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
	}

}
