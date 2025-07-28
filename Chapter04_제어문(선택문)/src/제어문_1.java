/*
	선택문
	형식)
		switch(정수, 문자, 문자열)
		{
			case 1: 
					처리문장
					break;
			case 2:
					처리문장
					break;
			default:
					처리문장
		}
		
		break 없이 사용
		switch(문자, 문자열, 정수)
		{
			case 1 -> {
				처리문장
			}
			case 2 -> {
				처리문장
			}
			
			-> 람다식
		}
		
		switch(문자, 문자열, 정수)
		{
			case1, 2 -> { 
				}
		
			case 3, 4 -> {
			
			}
			
		}

		-> 값 한개 선택 -> 다중 조건문 간결화
		-> 메뉴, 게임 키를 누르는 경우
		-> 게임 / 네트워크
		-> 1개만 사용이 가능
		-> 웹에서는 많이 사용하지 않음
		
		
*/

import java.util.Scanner;

public class 제어문_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력: ");

		int num = scan.nextInt();

		System.out.print("연산자 입력: ");
		String op = scan.next();

		System.out.println("두번째 정수 입력: ");
		int num2 = scan.nextInt();

		/*switch(op)
		{
			case "+":
				System.out.printf("%d %s %d = %d\n", num, op, num2, num + num2);
				break;
			case "-":
				System.out.printf("%d %s %d = %d\n", num, op, num2, num - num2);
				break;
			case "*":
				System.out.printf("%d %s %d = %d\n", num, op, num2, num * num2);
				break;
			case "/":
				System.out.printf("%d %s %d = %d\n", num, op, num2, num / num2);
				break;
			default:
				System.out.println("정상적인 연산자가 아닙니다.");
		}*/
		switch (op) {
		case "+" -> {
			System.out.printf("%d %s %d = %d\n", num, op, num2, num + num2);
		}
		case "-" -> {
			System.out.printf("%d %s %d = %d\n", num, op, num2, num - num2);
		}
		case "*" -> {
			System.out.printf("%d %s %d = %d\n", num, op, num2, num * num2);
		}
		case "/" -> {
			System.out.printf("%d %s %d = %d\n", num, op, num2, num / num2);
		}
		default -> {
			System.out.println("정상적인 연산자가 아닙니다.");
		}
		}
	}

}
