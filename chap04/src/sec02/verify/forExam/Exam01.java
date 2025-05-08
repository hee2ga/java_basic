/*
 * 중첩 for 문으로 왼쪽 삼각형만들기 연습
 */
package sec02.verify.forExam;

public class Exam01 {

	public static void main(String[] args) {
		int n=5; // 다섯줄
		for(int i=1;i<=n;i++) { // 다섯 행 출력
			for(int j=1;j<=i;j++) { // 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
