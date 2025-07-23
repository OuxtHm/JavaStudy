/*
	산술연산자
	-> 자동형변환
		1) 큰 데이터형으로 변경 후 연산
		10 + 10.5
		--
		10.0
		-----------20.5
		int + char
			  ----
			  int 변환
		--------------int
		
		double + char
				 -----
				 double 변환
		---------------- double
	
		2) int 이하 데이터형(byte, char, short)
			연산시에 결과값 -> int
			char + char = int
			short + byte = int
			
		3) +,- 보다 *, /, % 우선순위
			3 + 5 * 2 = 13
	
	
	+ : 덧셈, 문자열 결합
			---------- String
		
		-> 산술 규칙
		-> 7 + "7" + 7 = "777" 
		-> 7 + 7 + "7" + 7 + 7 = "14777"
		
		- : 뺄셈 5 - 2 = 3
		* : 곱하기 5 * 2 = 10
		-------------------- 7 + "7" * 10 = 오류
		/ : 나누기 
		 1) 정수 / 정수 = 정수  ex) 5 / 2 = 2(소수점 버림), 5 / 2.0 = 2.5
		 2) 0으로 나누면 오류 	ex) 10 / 0 = error
		% : 나머지 : 나누고 나머지
			- 배수, 여러명
			5 % 2 = 1
			-5 % 2 = -1
			-5 % -2 = -1
			5 % -2 = 1
			- 결과값은 항상 왼쪽 부호와 동일
		-------------------- 문자열 연산이 되면 안된다
		연산처리
		- 자동형 변환, 복자한 계산 (), 오버플로우
*/
import java.util.Scanner;

public class 산술연산자 {
	public static void main(String[] args) {
		/*int a = 369;
		System.out.println(a / 100);
		System.out.println(a % 100 / 10);
		System.out.println(a % 10);*/
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = scan.nextInt();
		
		System.out.println("========= result ==========");
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어 입력(abc abc abc) : ");
		String s = scan.nextLine();
		/*String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();*/
		
		System.out.println("==========result===========");
		//System.out.println(s1 + " " + s2 + " " + s3);
		System.out.println(s);
		
		
		
	}
	
}
