/*
	1학년부터 4학년까지 중간고사 시험을 봄. 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 이를 판단하는 프로그램 작성. 점수가 0미만 100 초과이면 경고문구 출력
*/

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학년 입력 : ");

		int grade = scan.nextInt();

		System.out.println("점수 입력: ");
		int score = scan.nextInt();
		if (score < 0 || score > 100)
			System.out.println("잘못된 점수입니다.");
		else {
			if (grade == 4) {
				if (score >= 70)
					System.out.println("합격입니다.");
				else
					System.out.println("불합격입니다.");
			} else {
				if (score >= 60)
					System.out.println("합격입니다.");
				else
					System.out.println("불합격입니다.");
			}
		}

	}

}
