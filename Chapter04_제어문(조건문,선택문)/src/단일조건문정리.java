/*
	자바에서 지원하는 프로그램 형식
	평문 : 위에서 아래로 한 문장씩 수행
	조건문 : 상황에 따라 동작 형식 변경
			-> 상황 여러개 if 여러개 사용
	반복문 : 중복 제거
	
	package package명 -> 한번만 사용
	import : 여러번 사용가능
	public class ClassName {

	public static void main(String[] args) {
		1. 변수 선언
		2. 변수 초기화
		3. 사용자 요청에 따른 처리 -> 제어문
		4. 결과출력

	}

}

	조건문
		단일 조건문
		형식) if(조건문)
			{
				true / false가 나오는 연산자 이용
					-> 부정 연산자 / 비교 연산자 / 논리 연산자
				조건이 true일 때 수행하는 문장		
			}
			false일 경우 if문 수행하지 않음
			
			-> 중복이 있는 경우 
				1 ~ 100
					-> 3, 5, 7배수 출력
					-> 15, 21 등 중복 존재
			-> if문은 독립문장
				-> 모든 if문 수행 -> 속도가 느림
			
			-> 여러개 문장을 동시에 수행
				if(조건문)
				{
					제어하는 문장 여러 개 추가
				}

*/
public class 단일조건문정리 {

	public static void main(String[] args) {
		int a = 15;
		
		if(a % 3 == 0)
			System.out.println("3의 배수");
		else if(a % 5 == 0)
			System.out.println("5의 배수");
		

	}

}
