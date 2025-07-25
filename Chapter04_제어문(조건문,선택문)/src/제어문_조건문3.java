/*
	사용자 정수 2 => 연산자 1
*/			
import java.util.Scanner;

public class 제어문_조건문3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		System.out.print("연산자 선택(+, -, *, /)");
		String temp = scan.next();
		
		char op = temp.charAt(0);	// 첫번째 문자 -> char화
		
		System.out.println("============결과==========");
		
		if(op == '+')
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 + num2);
		if(op == '-')
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 - num2);
		if(op == '*')
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 * num2);
		if(op == '/')
		{
			if(num1 <= 0 || num2 <= 0)
				System.out.println("0으로 나눌 수 없습니다.");
			if(num1 > 0 && num2 > 0)
				System.out.printf("%d %c %d = %.2f\n", num1, op, num2, num1 / (double)num2);
		}
			
			
		
	}

}
