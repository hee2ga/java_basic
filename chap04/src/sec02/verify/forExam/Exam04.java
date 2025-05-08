/*
 * 중첩 for 문으로 역삼각형 만들기 연습
 */
package sec02.verify.forExam;

public class Exam04 {
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) { // 5행 출력
			for(int j=1;j<=i-1;j++) { // 공백 출력
				System.out.print(" ");
			}
			for(int k=1;k<=2*n-2*i+1;k++) { // 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
