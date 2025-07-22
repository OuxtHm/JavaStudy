/*
 	형변환
 		- 자동 형변환 
 			큰 데이터 형 = 작은 데이터 형
 				|			|
 				 ------------
 				 	  |
 				  자동 형 변환
 			int a = 'A'; -> 'A' 자동으로 65로 변
 			4byte	 2byte
 			
 			long a = 100;
 			8byte	 4byte(int) -> long형으로 변경 100L
 			
 			double d = 'A' -> 65.0
 			
 			데이터형 = 같은 데이터형
 				변환  X
 			왼쪽이 크거나 같아야 함 작은 데이터가 들어오면 자동으로 데이터 형이 변경
 			
 			작은 데이터형 = 큰 데이터 형
 			int a = 10.5; -> 에러 발생 -> 강제로 변경 -> int a = (int)10.5;
 			char c = 65.0; -> char c = (char)65.0; -> c에 'A' 저장
 			예외 : char c = 65 -> 가능 65 = 'A' 
 			
 			byte b = (byte)350; 
 			
 			int a = 10;
 			int b = 3;
 			duble d = a / (double)b -> 3.0
 							----정수 -> 3 -> 3.0
 							정수 / 정수 = 정수
 							정수 / 실수 = 실수
 				
 		- 강제 형변환
 			- UpCasting
 			- DownCasting
 	1. 데이터형의 크기
 		--------> UpCasting
 		byte < char < int < long < double
 		<-------- DownCasting
 		
 	2. 연산자 : 같은 데이터 형만 연산
 				double + int X
 				int + int
 				double + double
 		10.5 + 10 -> 20.5
 		
 	변수의 데이터 형 
 	정수 : int
 	실수 : double
 	문자열 : String
 	논리형 : boolean
 	날짜 : Data
 	------------오라클 데이터형
 	int -> double : 평균 / 나누기
 	double -> int : 저장용도 
 	char -> int
 	int -> char
 	long -> int : 파일크기 (long) -> int
 	
 	데이터형 변수명
 	*** 지역 변수 -> 반드시 초기값 설정
 			- 메소드 안에서 상호작용 -> 스택 -> 메소드 종료시에 자동으로 사라짐
 		-> 명시적 -> 직접 값 대입
 		-> 입력값 -> Scanner / BufferedReader
 		-> 난수값 -> 임의값 추출
 	-> 같은 데이터 형
 		int a, b, c, d, e;
 		a = 0;
 		b = 0;
 		...
 		a = b = c = d = e = 0;
 		int a=0, b=0, c=0, d=0, e=0;
 		
 		
 		
 */

import java.text.DecimalFormat;

public class 데이터형변환_1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("####, ###, ###");
		int won = 1234567;
		
		
	}

}
