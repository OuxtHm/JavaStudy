/*
	1. 실행						프로젝트 (.class) -> jar
							 	JSP : war / ThymeLeaf : jar
		A.java ============ A.class =================== 실행
				  javac				   		java=JVM <-> 운영체제
				  컴파일 (0,1) -> 컴퓨터 인식	  인터프리터(번역된 문서를 한줄씩 읽어서 출력)
				  
	2. 들여쓰기
	3. 가독성, 최적화
		- 수정, 추가 
		- 속도, StringBuffer
	4. 변수 : 데이터 한 개만 저장되는 메모리 주소의 이름
		1) 변수 추출 -> 웹사이트
		2) 어떤 데이터형 -> 문자열, 실수, 정수...
			기본형 : 자바에서 제공
					#정수  
						- byte(1byte) -> -128 ~ 127
						- int(4byte) -> -21억 4천 ~ 21억 4천
									 -> 32bit
									 -> default : 컴퓨터는 모든 정수를 int로 인식
						- long(8byte) -> 64bit
									  -> 구분 (int,long) -> 1(L)
									  -> 범위를 벗어남 -> OverFlow, UnderFlow
					#실수
						평균, 별점, 표준편차, 확률, 통계
						- float(4byte)
						- double(8byte)
							-> default
					#문자
						- char(2byte) (0 ~ 65535) : Unicode -> UTF-8
						-> '' : null값 -> 오류
						-> ' ' : 공백을 주어야 함
					#논리
						- boolean : true, false
						- 제어문에서 주로 사용
			참조형 : 사용자 정의
					#배열	 : 같은 크기의 데이터 형을 여러개 모아서 정리
					#클래스 : 다른 데이터형 여러개를 모아서 관리
					참조형 데이터형 : String 
									- 일반 문자열 데이터 필요시에는 클래스형으로 사용가능
									- 문자열과 관련된 기능(메소드) 문자열 비교는 ==, !=를 사용하지 않는다
									
		3) 어떤 초기값 : 변수는 초기값이 있어야 사용이 가능, 필요시 변경해서 사용
			# 명시적 초기화 : int no = 1;
			# 사용자의 입력값 : Scanner, BufferedReader
							일반 -> 입력창
			# 임의 지정
				- Math.random()
				- Random r = new Random()
				 r.nextInt(10) -> 0 ~ 9
				 
				 
	-------------------------------------------------
		1. 변수 활용 -> 연산자
		2. 연산자 활용 -> 제어문
		3. 제어문 활용 -> 메소드
		4.메소드 활용 -> 객체지향
		--------------------
		-> 설계, 기능별 분리 -> 조립
		-> 라이브러리 (자료구조, IO, 네트워크, 오라클 연동)
			오류 방지 -> 예외처리
			
		자바에서 제공하는 연산자
		- 피연산자
			# 1개 : 단항 연산자
					- ***부정 연산자 : !(반대)
					- ***부호 연산자 : +, -, / , * , %
					- ***증감 연산자 : ++, --
							- 전치 연산자: ++a, --a
							- 후치 연산자: a++, a--
					- 반전 연산자	: ~(양수 <-> 음수)
					- ***형변환 연산자
							- (int), (double)...
					데이터 형의 크기
						byte < short < int < long < float < double
						-> UpCastting
						<- DownCasting
						1. 자동 형변환 : 데이터를 크게 만드는 경우
							- 값 대입 
								- int a = 'A';
									a = 65
							- 연산 처리
								- 10 + 10.5
								  10.0 변경
								  'A' + 1
								  65 -> int 변경 -> 연산처리
						2. 강제 형변환 : 데이터형을 작게 만드는 경우
							- 10 + (int)10.5 -> int -> DownCasting
							- 10 / (double)3 -> 소수점 -> UPCasting
			# 2개 : 이항 연산자
					- 산술 연산자 (+, -, *, /, %)
					- 비트이동 연산자 (<<, >>) -> 쉬프트연산자
					- 비트 연산자 (&, |, ^)
					- 비교 연산자 (==, !=, <, >, <=, >=)
					- 논리 연산자 (&&, ||)
					- 대입 연산자 (==)
					- 복합 대입 연산자 (+=, -=, *=, /=, %=)
			# 3개 : 삼항 연산자
		-----------------------------------
		
		연산 -> 출력
		입력값 받기
		-> Scanner : 키보드 입력
			1. Scanner 읽기 -> 메모리에 저장
				Scanner scan = new Scanner(System.in);
				- nextInt() : 정수값 읽기
				- next(): 문자열 읽기(공백포함 X)
				- nextLine() : 공백 포함하여 읽기
			입력창 
			2. JOptionPane.showInputDialog
				단점 : 문자열
					문자열 -> 정수 변경 : Integer.parseInt();
					문자열 -> 실수 변경 : Double.parseDouble();
					-> 모든 데이터형을 String 변경
								   ------ valueOf();
			출력
				System.out.printlf();	자동 줄바꿈
				System.out.printf();	정수(%d), 실수(%f), 문자(%c), 문자열(%s) 출력시 사용
										%f 가장 많이 사용
											%.1f, %.2f, %.3f....
										- 명령프롬프트 -> 웹X, 윈도우X 		
				System.out.print();		줄바꿈 X, 특수문자 사용 \t, \n
				JOptionPane.showMessageDialog();
			----------------------------------------------------------
			산술 연산자
			1) 데이터형이 다른 경우
				큰 데이터형으로 변경
				- 10 * 10.5 -> 결과값 double
				-------자동 형변환
			+ : 덧셈 + 문자열 결합
				문자열이 있는경우 붙힘 "7" + 7 = 77
			- : 뺄셈
			* : 곱셈
			/ : 나눗셈
			 	1. 0으로 나누면 오류
			 	2. 정수 / 정수 = 정수
			% : 나누고 나머지
				1. 결과값의 부호는 왼쪽부호를 따름
				5 % 2 = 1
				-5 % 2 = -1
				-5 % -2 = -1
				5 % -2 = 1
			
	
*/
import javax.swing.*;
public class 산술연산자_1 {

	public static void main(String[] args) {
		/*int max = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(max +2);
		
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		System.out.println(min - 1);*/
		
		// 정수 두 개를 받아서 산술 연산 처리 결과 출력
		String num1 = JOptionPane.showInputDialog("첫번째 정수 입력: ");
		String num2 = JOptionPane.showInputDialog("두번째 정수 입력: ");
		
		// 정수로 변경
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		String result = n1 + "+" + n2 + "=" + (n1 + n2) + "\n"
					  + n1 + "-" + n2 + "=" + (n1 - n2) + "\n"
					  + n1 + "*" + n2 + "=" + (n1 * n2) + "\n"
					  + n1 + "/" + n2 + "=" + (n1 / n2) + "\n"
					  + n1 + "%" + n2 + "=" + (n1 % n2);
		JOptionPane.showMessageDialog(null,result);
		
	}

}
