/*	
	1. 연산자 (목표) -> 단항연산자 / 이항연산자(산술연산자)
		1) 기본 : 변수, 연산, 제어
		2) 데이터를 묶어서 사용
			- 같은 데이터 : 배열
			- 다른 데이터 : 객체
		3) 관련된 명령문 : 기능
			EX) 게시판 : 목록 출력, 글 쓰기, 상세보기 , 수정, 삭제
				-> 기능 (메소드)
				-> 재사용이 가능
				-> 기능추가 -> 답변, 수정 -> 목록 (이미지)
	______________________________________________
	2025-07-22 정리
	1. 자바 실행과정 -> 클래스명과 파일저장명이 동일(대소문자 구분)
	 ex) class MainClass -> 저장명 : mainClass.java -> 오류
	 		
	 		컴파일 javac			java 인터프리터
	 A.java ---------> A.class -------------> 실행
	 원시소스		 바이트코드(이진파일)
	 
	 -> 프로그램 개발 -> 재사용 데이터 -> 메모리에 저장(변수)
	 변수 : 한 개의 데이터만 저장하는 메모리 공간의 이름 
	 
	 정수
	 	byte (-128~127) -> 8bit -> 1byte
	 	int (-21억 4천 7백~21억 4천 7백) -> 32bit -> 4byte : default값
	 	long -> 64bit -> 8byte
	 실수
	 	double -> 8byte -> 소수점 15자리 : default값
	 문자
	 	문자 한 개 저장 -> 0 ~ 65535 (각국 언어 사용O)
	 	char -> 표현식 ''
	 논리
	 	제어문, 연산자(비교연산자, 부저연산자, 논리연산자)
	 	---- 조건문, 반복문
	 	boolean -> true/false
	 문자열
	 	String : 일반 데이터형, 참조 데이터형
	 	------ 기능다수
	 변수 선언 : 변수 초기값 첨부
	 
	 1. 선언
	 	값 저장
	 	데이터형 변수
	 	변수 = 값
	 	선언과 동시에 값 저장
	 	데이터형 변수 = 값(리터럴)
	 	
	 정수표현법
	 10, 20 (10진법)
	 0b11100, 0b (2진법)
	 0123 (8진법)
	 0x1110 (16진법)
	 
	 문자 표현법
	 'A' , '홍'
	 문자열 표현법
	 "ABC" "Hello World!"
	 문장이 길 경우
	 """
	 문장....
	 """
	 
	 형변환
	 자동 형변환
	 	- 변수에 값 대입
	 		int a = 'A'
	 			char -> int (65)
	 		byte < char < int < long < double
	 		char c = 65
	 			int -> char ('A')
	 		double d = 10
	 			int -> double (10.0)
	 		int a = d; -> 오류
	 		-----
	 		크거다면 형변환 같다면 유지
	 	- 연산처리(데이터 형이 동일해야 연산)
	 		-> 동일하지 않다면 큰 데이터로 변경 후 처리함
	 		int + int => int
	 		long + int(변환됨) => long
	 		10 + 'A' = 
	 		
	 		char + char = int
	 		byte + byte = int
	 		char + byte = int
	 		***int 이하 데이터 (byte, char, short) -> 연산처리 : int
	 		
	 		결과값 int -> int, long, float, double
	 		결과값 long -> long, float, double
	 		결과값 float -> float, double
	 	
	 강제 형변환
	  - 객체시 많이 나옴
	  	ex) 인간 -> 남자 , 여자 
	  		인간 a = 남자 -> is-a
	  		남자 a = (남자)인간
	  		(데이터형)값
	  		큰 데이터 형 변경 -> UpCasting
	  		작은 데이터 형 변경 -> DownCasting
	  		
	  		**boolean은 형변황 x
	  		
	  		String : 모든 데이터형을 문자열로 변환
	  		int -> String -> int
	  		long -> String -> long
	  		double -> String -> double
	  		boolean -> String -> boolean
	  		
	  		String.valueOf(10) -> "10"
	  		String.valueOf(10L) -> "10"
	  		String.valueOf(10.5) -> "10.5"
	  		String.valueOf(true) -> "true"
	  		
	  		Integer.parseInt("10") -> 10
	  		Long.parseLong("10") -> 10
	  		Double.parseDouble("10.5") -> 10.5
	  		Boolean.parseBoolean("true") -> true
	  		
	  		각 데이터 형을 쉽게 사용할 수 있게
	  		클래스와 -> Wrapper
	  		int -> Integer
	  		long -> Long
	  		double -> Double
	  		boolean -> Boolean
	  		    
	  		** 윈도우 개발 / 웹 개발 -> 데이터는 String
	  		
	  		입출력
	  		System.out.println() : 가장 많이 사용 : 웹 -> 입력값 확인, 오류 메시지 출력 -> 자동 줄바꿈
	  		System.out.print() : 문법 사항 -> 줄바꿈 x, 가로로 출력 -> 한 명에 대한 데이터 출력 
	  		System.out.printf() : 출력 서식을 만들어 출력, C 언어에서 주로 사용
	  		printf("서식", 값) : 
	  		
	  		정수값 출력 
	  		%d사용, 왼쪽 정렬 시 %-3d, 오른쪽 정렬 시 %3d
	  		
	  		실수값 출력 
	  		%f
	  		%.2f 소수점 2자리 출력
	  		
	  		문자 : %c
	  		문자열 : %s
	  		
	  		*** 특수문자
	  		\n : 줄바꿈
	  		\t : 일정 간격
	  		\" : " 출력 -> html 전송시 주로 사용, MyBatis 
	  		\\ : \ 출력 -> 경로명
	  		___________
	  		Scanner 클래스화 -> 키보드 입력값
	  		Scanner scan = new Scanner(); 
	  		
	  		1. 정수 -> scan.nextInt();
	  		2. 실수 -> scan.nextDouble();
	  		3. 논리 -> scan.nextBoolean();
	  		4. 문자열 -> scan.next();
	  		
	  		입력 : 공백 -> 메모리에 저장 -> 엔터
	  		
	  		
*/	
import java.util.Scanner;

public class 자동형변환 {

	public static void main(String[] args) {
		/*double d = 10;
		System.out.println(d);
		int a = (int)d;
		System.out.println(a);
		
		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2;
		System.out.println(b3);
		
		System.out.printf("%3d%3d%3d", 10, 20, 30);
		
		System.out.printf("%f\n", 10/3.0);
		System.out.printf("%.2f\n", 10/3.0);
		System.out.printf("%.1f\n", 10/3.0);
		System.out.printf("%02d\n", 12);
		System.out.printf("%c\n", 'A');
		System.out.printf("%s\n", "홍길동");*/
		
//		byte b1 = 10;
//		byte b2 = 20;
//		int b3 = b1 + b2;
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("국어 점수: ");
//		int kor = scan.nextInt();
//		
//		System.out.print("영어 점수: ");
//		int eng = scan.nextInt();
//		
//		System.out.print("수학 점수: ");
//		int math = scan.nextInt();
		
//		System.out.print("국어 영어 수학입력(90 90 90):");
//		int kor = scan.nextInt();
//		int eng = scan.nextInt();
//		int math = scan.nextInt();
		
//		System.out.printf("%3d %3d %3d\n", kor, eng, math);
	
//		System.out.print("문자열 입력: ");
//		String msg = scan.nextLine();
//		System.out.print(msg);
		
		System.out.print("true/false 입력: ");
		boolean b = scan.nextBoolean();
		System.out.println(b);

		System.out.print("실수 입력: ");
		double d = scan.nextDouble();
		
		System.out.println(d);
	
	}

}
