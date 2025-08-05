/*
	자바 -> 기본 문법
		-> 변수 / 데이터형(기본형)
		-> 가공(사용자 요청)
		------------------ 연산자 / 제어문
		
	-> 관리
		-> 데이터 시작
			-> 배열 -> 한 개의 이름으로 관리(같은 데이터형)
			-> 클래스 -> 한 개의 이름으로 관리(다른 데이터형)
		-> 소스 코딩을 분리 -> 문장 단락
				메소드 : 객체지향의 핵심(재사용)
					- 변수, 연산자, 제어문
				-> 회원가입 / 로그인 / 게시판 / 페이징
				---------------------------------메소드 처리 -> 수정, 한 개로 묶어서 저장(객체)
				
	for -> 숫자의 규칙
	일반 for
	for(int i = 0; i < arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	for-each : 실제 저장된 값을 가지고 온다 -> 실제 데이터 출력 -> 수정
	for(int i : arr)
	{
		System.out.println(i);
	}
	-> 변경 / 초기값 -> 일반 for
	-> 출력 -> for-each -> 검색
	
	-> 배열 : 모든 데이터형이 가능
		1) 정수
			int[] arr = {1,2,3,4,5};
			int[] arr = new int[5]; -> 임시저장 -> {0,0,0,0,0}
		2) String[] arr = {"홍길동", "박문수", ....};
		   String[] arr = new String[5]; -> {null, null, null, null, null,} -> 메모리 주소가 없는 경우 NullPointerException
		3) boolean[] arr = {true, false, true, false,...}
		   boolean[] arr = new boolean[5]; -> {false, false, false, false, false...} / checkbox

*/
public class 배열_1 {

	public static void main(String[] args) {
		/*int[] arr = {10,20,30,40,50};
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}*/
		
		String[] names = {"홍길동", "심청이", "춘향이", "박문수", "이순신"};
		
		for(String s : names)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		for(int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + " ");
		}
	}

}
