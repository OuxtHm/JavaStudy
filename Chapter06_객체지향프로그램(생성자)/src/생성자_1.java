/*
	변수 : 메모리에 값을 저장
	--- 초기값(시작과 동시에 사용하는 값)
		1) 명시적인 초기화(고민)
			int a = 100;
		2) 외부에서 데이터 읽기 -> 명시적인 초기화 x 
			인스턴스 블록
			{
			
			}
			정적블록
			static	//Mybatis
			{
			
			}
			
			생성자
	1. 변수의 종류
		메소드 내 선언 : 지역변수
		클래스 영역 내 선언 : 인스턴스, 정적 변수
						인스턴스 - new를 사용할 때 따라 생성되는 메모리
						정적변수 - 메모리 공간 1개 -> 공유변수
		** 지역변수, 매개변수 -> 기본 값이 없다 -> 초기화 후 사용
		** 인스턴스, 정적변수 -> 기본값이 존재(ex int = 0 ...)
		** 변수
			기본형(int, long, double...)
			배열
			클래스
			
		class ClassName
		{
			변수 : 기본형 변수 
			배열 / 클래스 : 참조형 변수
		}

	2. 생성자
		1) 특징
			- 클래스명과 동일
			Scanner scan = new Scanner(System.in);
			- 리턴형이 없다(void도 리턴형)
			- 호출시기 -> 객체 생성시
			- 여러개 사용이 가능 : 오버로딩
			- 생성자를 사용하지 않는 경우 : 자동으로 생성자 추가
				------------------------------------- 
				디폴트 생성자 : 매개변수 없는 생성자
				- 네트워크 / 데이터베이스 / 윈도우
			- 역할
				변수에 대한 초기화
				-- 클래스에 선언되는 변수
				-- 초기화 메소드
			- 생성자 종류
				- 매개변수가 없는 생성자
					기본 생성자
				- 매개변수가 있는 생성자
				------------------
				- this() : 자신의 생성자 호출
				- super() : 상위 클래스의 생성자 호출
				- 없는 경우는 자동추가
			-------------------------------------------
			초기화
			1) 기본값 int a;
			2) 명시적 초기화
			3) static{} -> static 변수
			4){}
			5)생성자 -> 인스턴스
			  ---- 초기값을 다르게 생성
			  
			  class A
			  {
			  	A(){} -> 일반 메소드
			  	void A(int a){} -> 일반 메소드
			  	A(String n){}{
			  }
			  class B
			  {
			  	B(int a){}
			  }
			  class C
			  {
			  	C(){} 	// 자동추가
			  }
			  
			  오버로딩
			  ------ 한 개의 메소드로 여러 개의 기능을 처리
			  1) 메소드명이 동일
			  2) 매개변수의 갯수나 데이터형이 다르다
			  3) 리턴형은 관계 없다
			  4) 접근 지정어도 관계없다
			  ------------------------------------
			  -> 일반 기본형으로 설정된 변수는 생성자를 사용하지 않는다
			  -> 생성자
			  	-> 윈도우 -> 화면 UI
			  	-> 데이터베이스의 드라이버 등록
			  	-> 네트워크 -> 서버 가동
			  *** 생성자는 반드시
			  	 new 생성자()
			  	 ---
			  *** 객체 생성시에 new
			  				--- new를 이용하지 않고 객체 생성
			  					-> 추상 클래스 / 인터페이스
			  
			  
			  
				
*/



class Member
{
	int mno;
	String name;
	String address;
	String phone;
	String sex;
	
	// 초기화 -> 객체 저장시에 주로 사용
	Member(int m, String n, String a, String p, String s){
		mno = m;
		name = n;
		address = a;
		phone = p;
		sex = s;
	}
}



public class 생성자_1 {

	public static void main(String[] args) {
		Member m = new Member(1, "홍길동", "서울", "010-1111-1111", "남자");
		System.out.println("회원번호 " + m.mno);
		System.out.println("이름 " + m.name);
		System.out.println("주소 " + m.address);
		System.out.println("전화번호 " + m.phone);
		System.out.println("성별 " + m.sex);
		
		Member m1 = new Member(2, "심청이", "강원", "010-2222-2222", "여자 ");
		System.out.println("회원번호 " + m1.mno);
		System.out.println("이름 " + m1.name);
		System.out.println("주소 " + m1.address);
		System.out.println("전화번호 " + m1.phone);
		System.out.println("성별 " + m1.sex);
		
	}

}
