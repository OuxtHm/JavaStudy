package 자바기본문법;

/*	숫자
 * 		1. 정수
 * 			- 2진법 -> 1000 -> 0b1000 8출력
 * 			- 8진법 -> 111 -> 0111 73출력
 * 			- 10진법 -> 1000, 345, 123 ....
 * 			- 16진법 -> 0x111
 * 			- 21억 4천 정도 인식 -> 이상 넘어가면 : ~L붙이기
 * 		2. 실수 
 * 			- 10.5, 100.23...
 * 			
	문자
		- 문자 한 개 : 'A', '홍', '심' ... -> 모든 국가의 언어 사용이 가능 = Unicode : 한 글자 2바이트 -> 멀티 바이트
	문자열
		- 문자 여러 개 : "홀길동", "Hello World"...
	논리형
		- true/false
	특수문
		- \t, \n, \", \\
		
	실행과정
	
	프로그램 구동
	1. 컴파일 : Java / C# / C / C++ -> 컴퓨터 인식 언어로 변경
	2. 인터프리터 : 환 줄 씩 읽어서 출력  -> HTML / JavaScript/ Python
	
			javac(컴파일)
	A.java	-----------> 컴퓨터 인식 언어로 변경 -> 010101000110 -> A.class(바이트 코드) -> 한 줄씩 읽어서 출력
	-> 문법에러 : 컴파일 에러
	   실행에러 : 인터프리터 에러
	C/C++ : 저급언어 -> 하드웨어
	Python : 고급언어 -> 소프트웨어
	Java : 고급언어
	코볼 / 포트란 : 고급언어
	원시 소스
	   |프로그래머만 알고 있는 언어
*/
public class 자바표현식_실행과정 {
	public static void main(String[] args) {
		System.out.println(0b1000);
		System.out.println(0111);
		System.out.println(0x111);
		System.out.println(250000000L);
		System.out.println(10.5);
		System.out.println('홍');
		System.out.println('길');
		System.out.println('동');
		System.out.println("홍길동");
		System.out.println(true);
		System.out.println(false);
		System.out.print("Hello\tJava!!");
		System.out.print("\nHello Java!!");
		System.out.println("\"홍길동\"");
		System.out.println("C:\\JavaDev\\JavaStudy\\자바기본문법\\src\\자바기본문법\\자바표현식_실행과정.java");
		
	}
}
