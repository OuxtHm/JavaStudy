// 계산기 출력 종료전까지

import java.util.Scanner;

public class 제어문_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("첫번째 정수 입력: ");
			int num1 = scan.nextInt();

			System.out.println("연산자 입력: ");
			String strOp = scan.next();

			System.out.println("두번째 정수 입력: ");
			int num2 = scan.nextInt();

			switch (strOp) {
			case "+" -> {
				System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			}
			case "-" -> {
				System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
			}
			case "*" -> {
				System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
			}
			case "/" -> {
				if (num2 == 0)
					System.out.println("0으로 나눌 수 없습니다.");
				else
					System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
			}
			default -> {
				System.out.println("잘못된 연산자입니다.");
			}
			}
			System.out.println("종료할까요?(Y / N)");
			String s = scan.next();
			char c = s.charAt(0);
			if(c == 'y' || c == 'Y')
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(c == 'n' || c == 'N')
			{
				continue;
			}
		}

	}

}
