/*
	문자열 -> String : 1, 2, 3, 4 프로젝트
					 ------------------ 사용하는 변수 / 배열 / 클래스 사용되는 데이터형
	문자 여러개를 동시에 저장
	String == char[]
	-> String는 쉽게 제어 가능
	
	
	저장 방법
		String s = "문자열" -> 일반 데이터형
		String s = new String("문자열");
		
		new : 새로운 메모리 공간에 저장
		
	제어하는 기능
	1. 변환
		toUpperCase() : 대문자 변환
		toLowerCase() : 소문자 변환
	 -> 검색
	 -----------------------------
	 *****valueOf() ---- 모든 데이터형을 문자열 반환
	 ex)
	 	valueOf(10) -> "10"
	 2. 제어
	 	문자 자르기
	 	String substring(int beginIndex);
	 	String substring(int beginIndex, int endIndex); endIndex : -1된 값까지 자름
	 	문자를 자른다 -> 구분자, 문자별
	 	ex) green,blue,black
	 	-> String[] split(String del);
	 	공백문자 제거 -> 유효성 검사
	 	String trim() -> 좌우 공백 제거
	 	
	 	문자열 결합
	 	String concat(String s); ******사용빈도가 거의 없다 -> 보통 +를 사용, "ABC".concat("DEF")처럼 사용하는 경우 MySQL
	 3. 변경
	 	replace(char c1, char c2);
	 	replace(String s1, String s2);
	 	ex) String ss = "Hello Java";
	 		ss.replace('a', 'b'); -> Hello Jbvb
	 		ss.replace("Java", "Oracle"); -> Hello Oracle
	 		
	 		replaceAll(대상문자(문자열), 문자열);
	 		ex) 정규식 [가-힣] [A-Z]....
	 		
	 4. 찾기
		char charAt(int index) -> 문자 하나 추출
		"Hello Java"
		 0123456789 -> charAt(7) -> 'a'
		
		int indexOf(char) : 앞에서부터 찾음 / 크롤링 할 때 주로 사용
		int lastIndexOf(char) : 뒤에서부터 찾음 / 경로명 , URL, 확장자 등에 사용
		
		indexOf('l') -> 2	
		lastindexOf('l') -> 3
	5. 비교
		boolean equals(String s) : 같은 문자열일 때 true(대소문자 구분) / 로그인 처리 , 아이디 중복체크
		boolean equalsIgnoreCase(String s) : 같은 문자열일 떄 true(대소문자 구분 X) / 검색
		boolean startsWith(String s) : 시작 문자열이 같은지 확인 (대소문자 구분) / 자동완성기 -> 쿠키에 저장 -> 시작 문자열이 같은 경우
		boolean endsWith(String s) : 끝나는 문자열이 같은지 확인 (대소문자 구분)
		compareTo(String s) : 문자 비교 / 정렬 할 때 주로 사용
		ex) "Hello".compaerTo("Java") 양수 -> 2
			"Hello".compaerTo("Hello") 0
			"Java".compaerTo("Hello") 음수 -> -2
			-> 문자 크기 비교 H 와 J 비교 H 보다 J가 2 크다. 만약 맨 앞이 같다면 다음 글자 비교
			
		
*/

import java.util.Arrays;

public class 문자열배열_1 {

	public static void main(String[] args) {
		/*char[] ch = {'a', 'b', 'c', 'd', 'E', 'K'};
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z')
				ch[i] = (char)(ch[i]-32);
		}
		// 인덱스가 존재 -> 데이터 값을 변경
		// for-each -> 값만 받는 변수만 이용 -> 출력
		System.out.println(Arrays.toString(ch));
		
		String s = "abcdEK";
		System.out.println(s.toUpperCase());
				
		  char[] -> String
		  int -> Integer
		  long -> Long....
		  -------------------Wrapper
		*/
		// 문자열은 자체가 메모리 주소
		// 같은 문자열은 같은 주소를 가지고 있다.
		/*String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		if(s1 == s2)
			System.out.println("true");
		else
			System.out.println("false");
		
		if(s1 == s3)
			System.out.println("같다");
		else
			System.out.println("다르다");*/
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr;
		System.out.println(Arrays.toString(arr2));
		arr2[0] = 100;
		arr2[1] = 200;
		System.out.println(Arrays.toString(arr));
		// 클래스에서 제외 -> String -> 일반 데이터 형
		// 얕은 복사 : 같은 주소를 가지는 데이터
		// 깊은 복사 : 다른 주소를 가지는 데이터
		
		int[] arr3 = arr.clone();	// 새로운 메모리를 가짐
		System.out.println(arr);
		System.out.println(arr3);
		
		String s1 = "Hello";
		String s2 = "Java";
		
		int res = s2.compareTo(s1);
		System.out.println(res);
	}

}
