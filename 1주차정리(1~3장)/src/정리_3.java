/*
	변수 / 연산자 / 제어문
	묶기 / 
	
	변수 -> 데이터를 저장 -> 연산처리(응용 : 제어문)
	
	변수 + 연산자 + 제어문
	-------------------- 메소드
	메소드 여러개 묶음 
	----------------- 클래스
	클래스 여러개 묶음 
	----------------- 패키지 -> .jar
	
	연산자
	- 단항 연산자
		증감 연산자 (++, --)
			전치 연산자 : 먼저 증가
			후치 연산자 : 나중에 증가
		부정 연산자 (!)
		형변환 연산자 (데이터형)
	- 이항 연산자
		산술 연산자 (+, -, /, *, %)
			-> 자동 형변환
				큰 데이터 형으로 변경 후 연산 : 연산은 같은 데이터 끼리만 연산
					ex) double + int -> int를 double형으로 변경 후 연산
			연산자 종류
				+ : plus, 문자열 결합
				- : minus
				* : gop
				/ : 0으로 나누면 오류발생 -> infinity
				 	정수 / 정수 = 정수 -> 정수 / 실수 = 실수
				% : 나머지는 반드시 왼쪽부호를 따름
					배수 / 숫자 자르는 경우 -> 화폐매수 구하기
					-> 윤년 구하기
		비교 연산자 (==, !=, <, >, <=, >=)
					-> 숫자만 비교가 가능
					-> 예외 : boolean/ ==, !=
					-> 조건문 / 반복문에서 주로 사용
					   ------ 삼항 연산자
					-> 문자열 비교
						equals 사용
					-> 결과값 boolean(true/false);
		논리 연산자 (&&, ||)
			(조건) && (조건) -> boolean
			효율적인 연산 -> 왼쪽에 있는 조건이 false면 오른쪽에 있는 조건은 수행 X
			-> 사용 : 범위, 기간 포함 여부 확인
					오라클 : Between ~ AND
		대입 연산자 (=, +=, -=)
			= 대입
			+= , -= : 복합 대입 연산자
	- 삼항 연산자	((조건) ? 값1(true) : 값2(false))
	
		

*/
import java.util.Scanner;
public class 정리_3 {

	public static void main(String[] args) {
		/*int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x="+x);	// 12
		System.out.println("=====");
		
		y--;
		--y;
		System.out.println("y="+y); //8
		System.out.println("=====");
		
		z = x++;
		System.out.println("z="+z); // 12
		System.out.println("x="+x); // 13
		z = ++x;
		System.out.println("z="+z); // 14
		System.out.println("x="+x); // 14
		
		
		z = ++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println("=====");
		boolean bCheck = false;
		System.out.println(bCheck);
		System.out.println(!bCheck);
		System.out.println("=====");
		System.out.println(65.0);
		System.out.println((int)65.0);
		System.out.println((double)'A');
		System.out.println((double)65);
		
		char c1 = 'A';
		char c2 = 'B';
		int c3 = c1 + c2;
		System.out.println(c3);
		
		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2;
		System.out.println(b3);
		Scanner scan = new Scanner(System.in);
		final String ID = "admin";
		final String PWD = "1234";
		
		System.out.println("ID 입력 : ");
		String id = scan.next();
		System.out.println("PWD 입력 : ");
		String pwd = scan.next();
		
		System.out.println((id.equals(ID) && pwd.equals(PWD)) ? "로그인 완료" : "로그인 실패");
		
		
		for(int i = 1; i <= 10; i+=2)
		{
			System.out.println("Hello Java!!");
		}*/
		
		
	}
	
}