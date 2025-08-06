/*
	class ClassName
	{
		------------------------
		변수 : 클래스 전체 사용
			  다른 클래스에서 사용이 가능
			  	-> 클래스 멤버 변수
		------------------------
		생성자 : 클래스 동일
			   변수의 초기화
		------------------------
		메소드 : 기능처리
		------------------------
	}

	-> 프로그램 
		1. 변수
		2. 변수 처리 방법 -> 메소드
		
		-> 1. 변수 설정 : 멤버변수 / 지역변수 / 매개변수
											ㄴ 사용자 요청을 받는 경우 ex) 로그인 - id/pw , 검색 - 검색어
											
		메소드
			1. 반복제거
			2. 구조적인 프로그램
				단락나눠서 처ㅣㄹ
			3. 관련된 명령문을 모아서 처리
			4. 재사용
			5. 다른 클래스와 통신
				-----------> 수정 / 추가
			6. 메소드 -> 다음에 사용할 수 있게 한 가지 기능 수행
					-> 라이브러리
					
		메소드
		1) 형식
			[접근지정어] public / protected / private / default
			[제어어]	default / static / abstract / final	- 종단 : 수정 불가
							 ㄴ 컴파일시 자동저장 ㄴ 추상메소드 : 선언
				static 공통
				static이 없는 경우는 객체
				
		([접근지정어][제어어]) static 리턴형 메소드명(매개변수)
		{
			return 결과값
		}
		
		리턴형 : 사용자가 요청한 내용을 처리 휑 결과값을 보내준다
			-> 리턴은 반드시 한 개만 전송이 가능
			-> 여러개 : 배열 / 클래스
			-> 일반 데이터형(참조형 : String , 배여럐)
		메소드명 : 소문자로 시작
				 변수 -> 식별자 동일
		매개변수 : 사용자가 요청한 값
				결과값이 없는 경우 : 오라클에 저장해 달라
								 삭제 / 수정 -> void 
		2) 한가지 기능이 어디까지 인지..
		3) 사용자로부터 받는 값
			여러개 사용이 가능 -> 3개 이상 : 배열 / 클래스
		4) 처리 결과 : 리턴형
					-> 출력하라 void
		---------------------------------
			리턴형			매개변수
		---------------------------------
			 O string 		  O replace(char c1, char c2)
		---------------------------------
			 O				  X		double random()
			 						Math 
		---------------------------------
			 X				  O
			 void main(String[] arg)
			 	-> Database : DML -> INSERT / UPDATE / DELETE
			 	void print(String s) / printf / println
		---------------------------------
			 X-> 출력 : * 100개 X -> 사용 빈도가 없다
			 System.out.println()
		---------------------------------
		
		메소드 : 변수 + 연산자 + 제어문
		기본 : 입력 기능
			  처리 기능 -> 세분화(재사용)
			  출력 기능

		5) 동작 순서
			-> 메소드 호출 전까지 수행
			-> 메소드 이동 -> 메소드 종료시까지 수행
			-> 호출한 위치로 이동
			-> 밑에 있는 문장 수행
		6) 호출 방법
			1. 같은 클래스 안에서 호출
			  - class A
				{
					void display()
					{
					}
					pulic static void main(String arg[])
					{
						display() -> 오류 
							
						A a = new A;
						a.display();
					}
				}
			  
			  - class A
				{
					static void display()
					{
					}
					pulic static void main(String arg[])
					{
						display() -> 오류 
							
						A a = new A;
						a.display();
					}
				} 
			2. 다른 클래스에서 호출
				- class A
				  {
					B.display()  ex) Math.random
					
					String s = " Hello";
					s.trim()
					String ss = " Hello Java"
			      }
			      class B
			      {
			      	static void display()
			      	{
			      	}
			      }
				
			
			
			
			
			
			3. 인스턴스 메소드 호출
		7) 메소드 변수 선언 : 메소드가 종료되면 메모리에서 사라진다
		   ------------
		   		ㄴ 지역변수 / 매개변수
		   		 ---------------- 메소드 안에서만 사용하는 변수
		   		 ** main에서는 소스코딩 없이 -> 시작점만 사용




*/
public class 클래스구성요소 {

	public static void main(String[] args) {
		

	}

}
