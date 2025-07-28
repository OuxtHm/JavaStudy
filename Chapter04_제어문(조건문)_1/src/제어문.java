/*
	프로그램 : 순차적 -> 위에서 아래 방향 한줄씩 번역
	프로그램의 종류
		- 평문 : 일반 명령문만 수행 -> HTML / CSS
				-> 문법사항 (변수 선언, 연산처리...)
		- 조건문 : 필요시에만 다른 기능을 수행
				-> 검색(사이트)
				-> 상세보기
				-> 로그인 처리 / 아이디 중복 체크 / 아이디 찾기 / 비밀번호 찾기
	1) 단일  조건문 (******)
		-> 독립적 조건문 하나하나 검색 -> 속도가 느림
		-> 중복적으로 수행
			1~100 -> 3의 배수, 5의 배수, 7의 배수
	2) 선택 조건문(***)
		-> 조건이 true / false
		-> 웹에서 사용빈도가 많다
				----- 결과값을 전송
	3) 다중 조건문 : -> 메뉴
		-> 한 개의 문장만 수행 -> 조건에 맞는 if만 찾음
		-> 메뉴 제작
	4) 중첩 조건문 : A -> A+, A0, A-...
					조건 (&&)

	1. 단일 조건문 -> 문법 / 형식
		형식)
			*** 자바에서 지원하는 모든 제어문은 바로 밑에 있는 문장만 제어
			여러개의 문장을 제어하긴 위해선 {} 사용하여 묶음
		실행 순서) 
			-> 형식, 문법, 실행
			if -> 필요하면 명령문을 수행, 필요없는 경우 skip
				  필요시마다 상황을 다르게 만든다
		String : equals / contains / startsWith / endsWith
				-> 결과값 : true / false
		
	난수 
	Math.random() -> 임의의 실수 추출 0.0 ~ 0.99
	1 ~ 100 : (int)(Math.random() * 100) + 1

*/
// 예제 최대값, 최소값 -> 정수 3개 입력받아 구분
public class 제어문 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		int num3 = (int)(Math.random() * 100) + 1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		int max = num1;
		if(max < num2)
		{
			max = num2;
			System.out.println("max < num2 문장 수행");
		}
		System.out.println("if skip");
		if(max < num3)
		{
			max = num3;
			System.out.println("max < num3 문장 수행");
		}
		System.out.println("if skip");
		System.out.println("max = " +max);
		
		int min = num1;
		if(min > num2)
		{
			min = num2;
			System.out.println("min > num2 문장 수행");
		}
			
		if(min > num3)
		{
			min = num3;
			System.out.println("min > num3 문장 수행");
		}
			
		System.out.println("min = "+min);
	}

}
