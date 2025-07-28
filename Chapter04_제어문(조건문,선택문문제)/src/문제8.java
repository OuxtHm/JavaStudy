// 정수 3개를 입력받아 총점과 평균을 구하고 학점을 구하는 프로그램 작성
// 90 이상 A 80 이상 B 70 이상 C 60 이상 D 나머지 F

import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력: ");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		int total = num1 + num2 + num3;
		int avg = total / 3;
		System.out.println(avg);

		int ten = avg / 10;
		System.out.println(ten);

		switch (ten) {
		case 10, 9 -> {
			System.out.println('A');
		}
		case 8 -> {
			System.out.println('B');
		}
		case 7 -> {
			System.out.println('C');
		}
		case 6 -> {
			System.out.println('D');
		}
		default -> {
			System.out.println('F');
		}
		}
	}

}
