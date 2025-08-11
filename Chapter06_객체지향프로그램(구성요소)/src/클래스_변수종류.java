/*
	클래스 전체 구조
	class ClassName
	{
		------------------
		변수 선언
			-> 인스턴스
				[접근지정어] 데이터형 변수명
				-> 생성 : 클래스명 객체명 = new 생성자()
							-> 객체명.변수명
						-> new에 따라 여러개를 저장할 수 있다
			-> 클래스 변수 / 정적변수 / 공유 변수
				[접근지정어] static 데이터형 변수명
					-> 클래스명.변수명
					-> 한 개만 생성
					class A
					{
						int a; // 메모리에 저장이 안된상태
						static int b; // 메모리에 저장된 상태
					}
					A aa = new A();		a -> 저장
						  ----- 동적 메모리 -> new 마다 새로운 메모리를 만들어 준다
						  				 -> 클래스에 선언된 변수를 모아서 한개의 메모리를 만든어 준다
						  				 -> 메모리 주소를 객체변수에 전송
					Scanner scan = new Scanner(System.in) 
					scan.nextInt() -> instance : 메모리에 저장된 데이터
					Scanner scan1 = new Scanner(System.in)
					scan1.nextInt()
					
					Math.random() -> static
				-> 다른 객체가 가지고 있는 변수에는 접근이 불가능 하다
				** 객체명.변수
				** 클래스명.변수 : 공통으로 가지고 있는 변수
					-> 한 번 변경되는 모든 객체 값이 변경
		------------------
		생성자 : 변수에 대한 초기화 : 생략
				-> 가장 먼저 호출되는 메소드
				-> 시작과 동시에 처리
				-> 변수 초기화 : 데이터베이스, 쿠키, 네트워크...
		------------------
		메소드 선언 : 기능 처리
		------------------


*/


// 같은 학교

class Student
{
	// new를 이용할 때 마다 따로 생성
	int hakbun;
	String name;
	String sex;
	
	// 메모리 공간이 1개 생성 -> 공유변수
	static String schoolName = "SIST";
	// 데이터를 모아서 관리
}


public class 클래스_변수종류 {

	public static void main(String[] args) {
		// 첫번째 생성
		Student hong = new Student();
		// hong(메모리주소) Student@1f32e575 -> hakbun/name/sex
		hong.hakbun = 1;
		hong.name = "홍길동";
		hong.sex = "남자";
		System.out.println("학번: " + hong.hakbun);
		System.out.println("이름: " + hong.name);
		System.out.println("성별: " + hong.sex);
		System.out.println(hong.schoolName);
		
		System.out.println();
		
		Student shim = new Student();
		shim.hakbun = 2;
		shim.name = "심청이";
		shim.sex = "여자";
		hong.name = "홍길동1";
		hong.schoolName = "SIST2";
		shim.schoolName = "SIST3";
		Student.schoolName = "SIST4";	// 주로 사용하는 방법(객체명으로 변경하지 않고 클래스 명으로 바꿈)
		
		System.out.println("학번: " + shim.hakbun);
		System.out.println("이름: " + shim.name);
		System.out.println("성별: " + shim.sex);
		System.out.println(shim.schoolName);
		System.out.println(hong.schoolName);
		System.out.println("이름: " + hong.name);
		System.out.println(hong.schoolName);
		
	}

}
