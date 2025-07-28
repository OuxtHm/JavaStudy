/*
	국, 영, 수 점수 입력 -> 총점, 평균 -> 60점 이상 합격, 이하 불합격

*/

import java.util.Scanner;

public class 제어문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 점수를 입력하세요");
		
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		System.out.printf("총점 : %d점\n", total);
		
		double avg = total / 3.0;
		System.out.printf("평균 : %.2f\n", avg);
		
		if(avg >= 60)
			System.out.printf("평균 %.2f점으로 합격입니다.", avg);
		else
			System.out.printf("평균 %.2f점으로 불합격입니다.", avg);

	}

}
