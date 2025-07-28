// 정수 3개를 입력받아 총점과 평균을 구하고 학점을 구하는 프로그램 작성
// 90 이상 A 80 이상 B 70 이상 C 60 이상 D 나머지 F

import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력: ");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		int total = num1 + num2 + num3;
		int avg = total / 3;
		System.out.println("평균: " + avg);
		if (avg >= 90)
			System.out.println('A');
		else if (avg >= 80)
			System.out.println('B');
		else if (avg >= 70)
			System.out.println('C');
		else if (avg >= 60)
			System.out.println('D');
		else
			System.out.println('F');

	}

}
