package com.sist.constructor;

/*
	class ClassName
	{
		int age;
		String name;
		
		메모리에 저장
		1. 초기값 -> 명시적인 초기화
			int age = 30;
			String name = "홍길동";
		2. 초기화 블록
			int age;
			String name;
			{
				age = 20;
				name = "심청이";
				-----------------명시적으로 처리
				
				-> 명시적으로 초기화가 불가능한 부분
				-> 데이터베이스 값을 일긱
				-> 크롤링, 파일 읽기, 윈도우 폼
				
				-> 문제점 
					항상 같은 데이터만 저장
				-> 다른 값을 저장
					생성자 -> 매개변수
					
				static
				{
					// 매개변수를 이용할 수 없다
				}
				
				생성자
				-> 여러개를 만들 수 있다
					-> 매개변수가 다른 경우 (오버로딩)
				// 특별한 경우가 아니면 변수에 대한 초기화를 하지 않는다
				// 서버 연결, 데이터 베이스
				
				class ClassName
				{
					------------
					변수 -> 은닉화 / 캡슐화
						   getter setter -> lombok
						   데이터 보호
					------------
					생성자 -> 서버 연결 : 필요시에만 사용
					------------
					메소드 -> 구현 -> 수정 / 추가 -> 상속
					------------ 필요시에만
				}
				
				***데이터형 클래스 : 변수만 모아서 저장
				***액션 클래스 : 기능 -> 메소드
				혼합형 클래스 : 변수 + 메소드
				-----------------------
					브라우저 전송 : 조립
			}
			
	}

*/
// -> 데이터형 -> 숨겨진 데이터

class Music
{
	int rank;
	String poster;
	String title;
	String singer;
	String album;
	String state;	// 유지, 상승, 하강
	int idcremant;	// 단계
}

/*
	클래스의 구성요소
	class ClassName
	{
		------------
		변수
		- 데이터를 따로 저장 : new를 이용해 메모리 공간을 만든다 -> 데이터를 저장 : 인스턴스 변수
						  *** new를 이용하면 메모리가 따로 생성
						  *** new 사용시에 반드시 생성자를 동반
						  형식) new 생성자()
						  	  ----------
						  	  	new -> 클래스 크기 확인
						  	  		   메모리 만든다
						  	  		   메모리 주소 리턴
						  	  	생성자 -> 메모리에 값을 대입
						  	  	int malloc(클래스) -> new 연산자로 변경
						  	  	*** 메모리 주소는 int를 넘어가지 않는다.
						  class A
						  {
						  	int a, b,c,d; -> 16byte
						  	static int e; -> static이기에 메모리 공간 다른 곳(멤버변수)
						  	String name; -> 모든 클래스는 4byte
						  } -> 20byte
						  
		- 데이터를 한 개 저장 : 메모리 공간이 한 개만 생성
							공유 변수
		------------
		초기화 -> 프로그램에서 필요시에 처음대입 값
		일반 값을 대입 : 명시적 초기화
		*** 클래스 블록 : 구현 -> 외부데이터 읽기 대입(x)
		------------
		초기화 블록 : 자동 호출
		생성자 -> 주로 사용, 직접 호출
		-> 상속예외, 리턴형이 없다
		-> 클래스명과 동일
			class A
			{
				***A()[]
				void A(){} -> 객체명.A()
				int A(int a){} -> 객체명.A(10)
				A(int a, int b){}--ㄱ
				***A(int c, int d){}----- 둘이 같은 매개변수를 사용중이라 오류 발생
				***A(double d){}
				//*** 한 것만 생성자 
			}
			-> 오버로딩 : 한 개의 메소드명으로 여러 개의 새로운 기능을 만든다
				-> 초기화
				-> 사용자로부터 값을 받아서 초기화
					매개변수를 가지고있는 생성자
				-> 오버로딩
					1) 메소드명 동일
					2) 매개변수가 다르다
						-----------
						- 갯수가 다른 경우
							substring(int begin)
							substring(int begin, int end)
						- 데이터형이 다른 경우	
							print(String s)
							print(int i)
							print(char c)
							
						중복 메소드 정의
				-> 값을 입력 받아서 처리
				-> 네트워크 / 데이터베이스 -> 미리 연결
				-> 시작과 동시에 처리해야 할 내용이 있는 경우
				-> 화면 UI
				-> 반드시 한 개 이상 존재 : 없는 경우에 자동 생성이 된다
									   매개 변수가 없는 생성자
									   	-> 디폴트 생성자
				
		------------
		
		------------
	}


*/
class GenieMusic
{
	Music[] music = new Music[50];
	// 코딩이 불가능
	{
		// 크롤링
	}
	GenieMusic()
	{
		// 생성자
	}
}

class 학생
{
	String name;
	int hakbun;
	/*학생(int h, String n)
	{
		name = n;
		hakbun = h;
	}*/
	
}

public class 초기화_1 {

	public static void main(String[] args) {
		학생 a = new 학생();
		
		/*학생 a = new 학생(1, "홍길동");
		System.out.println(a.hakbun);
		System.out.println(a.name);
		
		학생 b = new 학생(2, "심청이");
		System.out.println(b.hakbun);
		System.out.println(b.name);*/

	}

}
