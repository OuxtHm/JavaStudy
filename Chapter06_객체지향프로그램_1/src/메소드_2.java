/*
	변수 / 데이터형 / 연산자 / 제어문 -> 프로그램의 기본
	관련된 데이터를 묶는다
		- 같은 데이터형 (배열)
		- 다른 데이터형 (클래스)
	관련된 명령문을 묶는다 (메소드)
	-> 만들지 못하는 부분이 존재
	-> 제공 : API
	-------------------------묶어서 처리 -> 객체


	리턴형받기 -> 기본형 / 배열 / 클래스(상세보기)
	
	사칙연산

*/
import java.util.Scanner;

public class 메소드_2 {
	
	static int input(String msg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(msg);
		return scan.nextInt();
	}
	static int plus(int fir, int second)
	{
		return fir + second;
	}
	static int minus(int fir, int second)
	{
		return fir - second;
	}
	static int multi(int fir, int second)
	{
		return fir * second;
	}
	static String division(int fir, int second)
	{
		if(second == 0)
			return "0으로 나눌 수 없습니다.";
		else
			return String.valueOf(fir / (double)second);
	}
	
	// 계산기
	static void process()
	{
		int a = input("첫번째 정수 입력: ");
		int b = input("두번째 정수 입력: ");
		
		System.out.println("연산자 입력: ");
		Scanner scan = new Scanner(System.in);
		String op = scan.next();
		
		switch(op)
		{
		case "+" -> {
			int result = plus(a, b);
			System.out.printf("%d + %d = %d\n", a, b, result);
		}
		case "-" -> {
			int result = minus(a, b);
			System.out.printf("%d - %d = %d\n", a, b, result);
		}
		case "*" -> {
			int result = multi(a, b);
			System.out.printf("%d * %d = %d\n", a, b, result);
		}
		case "/" -> {
			System.out.println(division(a, b)); 
		}
		}
	}
	
	public static void main(String[] args) {
		process();
		
	}

}
