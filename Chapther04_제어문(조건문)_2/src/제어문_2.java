/*
	정수 2개 입력 
	연산자 입력
	사칙연산


*/
import java.util.Scanner;

public class 제어문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력: ");
		int first = scan.nextInt();
		
		System.out.println("연산자 입력");
		String str = scan.next();
		char op = str.charAt(0);
		
		System.out.println("두번째 정수 입력: ");
		int second = scan.nextInt();

		if(op == '+')
			System.out.printf("%d %c %d = %d", first, op, second, first + second);
		else if(op == '-')
			System.out.printf("%d %c %d = %d", first, op, second, first - second);
		else if(op == '*')
			System.out.printf("%d %c %d = %d", first, op, second, first * second);
		else if(op == '/')
		{
			if(second == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("%d %c %d = %d", first, op,second, first / second);
			
		}
			
		else
			System.out.println("잘못된 연산자 입력");
		
	}

}
