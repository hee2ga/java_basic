/*
 * 중첩 for 문으로 다이아몬드 만들기 연습
 */
package sec02.verify.forExam;

public class Exam05 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) { 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int m=1;m<=i;m++) {
				System.out.print(" ");
			}
			for(int l=1;l<=2*n-2*i-1;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
