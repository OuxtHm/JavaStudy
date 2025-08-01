/*
	문자열 저장
	String -> 데이터형 + 클래스(기능처리)
	
	1. 저장방법
		String 변수명 = "문자열" -> 제한이 없음
	2. 문자열 제어가 가능하도록 기능처리 -> 메소드제공
		메소드
		1. 리턴형
		2. 메소드명
		3. 매개변수
		4. 어떤 기능
		-> 변경 X 클래스
			Stirng / System / Math -> 종단 클래스(final)
		-> 형태
			리턴형 메소드명(매개변수_lsit)
		1) 문자의 갯수
			length()
			원형 -> int length() -> .length() : '.'은 주소 접근자
		2) toUpperCase() aaa -> AAA 대문자 변환
		   toLowerCase() AAA -> aaa 소문자 변환
		   -> 원형 String toUpperCase()
		          String toLowerCase()
			주의 : 한글 / 숫자는 변환 X
				  원본은 변하지 않음 출력할 때만 변경되어 출력
		3)substring() -> 원하는 문자열을 자를 때 사용
			-> 원형 : String substring(int beginIndex) -> beginIndex부터 마지막 문자까지 자르기
					 String substring(int beginIndex, int endIndex) beginIndex부터 endIndex -1 까지 자르기
					 
				***메소드는 같은 이름으로 제작할 수 없다.
				***예외조건 : 매개변수의 갯수나 데이터형이 다르면 다른 메소드로 인식 -> 오버로딩
		

*/
public class 정리_8 {

	public static void main(String[] args) {
/*		String s = "0123456789";
		System.out.println(s.length());
				
		String s1 = "Hello 자바 123456";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
*/
		
		String s = "0123456789";
		System.out.println(s.substring(5)); //56789
		System.out.println(s.substring(5, 9)); //5678
		
		
	}

}
