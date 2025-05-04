package sec02.verify.exam09;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		double num1=Double.parseDouble(scanner.next());
		System.out.print("두번째 수 : ");
		double num2=Double.parseDouble(scanner.next());
		System.out.println("--------------------");
		
		System.out.print((num2==0)||(num2==0.0)?"결과 : 무한대":"결과 : "+num1/num2);
		
	}

}
