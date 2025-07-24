/*
	웹 개발
	-------
	연산자	------------> 오라클, 자바 스크립트
		1. ***산술 연산자
		2. 비교 연산자
		3. ***증감 연산자
		4. ***형변환 연산자
		5. 논리 연산자
		6. ***부정 연산자
		7. 대입 연산자
		
		
	_________________________
	비교 연산자 : 결과값이 ture,flase
		사용 가능
			정수, 실수, 문자, 논리(제한적) -> ==, !=
			--> 문자열, 날짜 -> 비교 X
			
	1. == (같다)
	2. != (같지 않다)
	3. < (크다)
	4. > (작다)
	5. <= (크거나 같다)
	6. >= (작거나 같다)
	
	사용처 : 조건문 / 반복문
		if(비교 연산자 | 논리 연산자 | 부정 연산자){
			true/ false
		}
		while(비교 연산자 | 논리 연산자 | 부정 연산자){
			 
		}
	
		

*/
public class 비교연산자 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);	// t
		boolean result2 = (num1 != num2);	// f
		boolean result3 = (num1 <= num2);	// t
		
		char c1 = 'A';
		char c2 = 'B';
		boolean result4 = (c1 < c2);	// t
		// *** char 데이터형은 코든 연산이 수행되면 정수로 변환
		// 65 < 66
		float f = 0.1f;
		double d = 0.1;
		boolean result5 = (f == d);	// f : 
		
		boolean b1 = true;
		boolean b2 = false;
		boolean result6 = (b1 == b2);	// f
		boolean result7 = (b1 != b2);	// t
		
		String s1 = new String("Hello");	// new 새로운 메모리에 저장
		String s2 = "Hello";
		String s3 = "Hello";
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		
		
		
		boolean result8 = (s1 == s2);	// f
		boolean result9 = (s1 != s2);	// t
		boolean result10 = (s2 == s3);	// t
		boolean result11 = (s2 != s3);	// f
		boolean result12 = (s1.equals(s2));	// t
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		System.out.println("result10: " + result10);
		System.out.println("result11: " + result11);
		System.out.println("result12: " + result12);
		
		String ss1 = "Hello";
		String ss2 = "hello";
		
		boolean result13 = (ss1.equals(ss2));	// f	 equals : 대소문자 구분	/ id 찾기 , 비밀번호 찾기, id 중복체크
		boolean result14 = (!ss1.equals(ss2));	// t
		boolean result15 = (ss1.equalsIgnoreCase(ss2));	// t	equalsIgnoreCase : 대소문자 구분 X	검색
		
		System.out.println("result13: " + result13);
		System.out.println("result14: " + result14);
		System.out.println("result15: " + result15);
		
		/* 
		  	비교 연산자 -> 숫자(정수, 실수), 문자, boolean
		 	문자열은 자체 라이브러리를 이용 
		 		- contains() -> (단어) 포함
		 		  startsWith() -> (단어)로 시작하는 문자열
		 		  enesWith() -> (단어)로 끝나는 문자열/ 파일확장자
		 		  
		 	String -> 클래스 (기능 -> 메소드) -> 표준화
			__________________________________________ 서제스트
			System / String / Math	...  수정 불가 
			
		*/
	}

}
