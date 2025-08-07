/*
	1. 객체지향프로그램
		클래스
		1) 클래스  구성요소
		   -------------
		     ***변수
		     - 인스턴스변수 : 메모리 저장할 때 따로 저장되는 변수
		     - 정적변수 : static -> 메모리 공간을 한 개 사용 -> 공유하는 변수 -> MethodArea
		     - 지역변수 : 메소드가 종료되면 사라지는 변수 -> Stack -> {} 메모리 = 자체관리
		   -------------
		   ***메소드
		        목적
		        	- 반복되는 기능 제거
		        		ex) DB
		        		 ------------
		        		     모든기능
		        		     오라클 연결
		        		     기능 처리
		        		     오라클 닫기 -> 기능 10개
		        		      -> 유지보수 : 기능
		        		      -> 프로그램 80%
		        	- 소스가 간결해진다
		        	- 재사용(다른 클래스와 연결)
		        	-----------------------
		        		오버로딩 / 오버라이딩 -> 메소드
		        	- 단락을 나누는 과정
		        		- 코드 관리가 쉽게 (기능별 분리)
		        		- 가독성
		        	***
		        	 1. 가독성
		        	 2. 최적화
		        	 	scp
		        	 	async
		        	 3. 수정 / 추가
		        	 4. 공통으로 사용되는 기능 -> 공통모듈
		        	***
		        	
		        	생성자 : 변수에 대한 초기화
		        		 -> 프로그램에서 가장 먼저 호출
		        		 -> 시작과 동시에 구현
		        		 -> 서버 / 데이터베이스 / 화면 UI
		        		 -> 자동 로그인
		        		 -> 메소드의 일종
		        		 -> . -> new 생성자()
		        	*** 함수 / 메소드
		        		-> 기능 처리
		        		-> 독립적 : 함수 : C++, 파이썬
		        		-> 메소드 -> 클래스 영역 -> 클래스 종속
		   -------------
		   	  생성자
		   -------------

		2) 메소드
			형식)
				[접근지정어][제어어] 리턴형 메소드형(매개변수 목록)
				{
					명령문
					return 값;
				}
			접근 지정어 : default / public / protected / private
				default : 같은 폴더 안에서만 접근 가능
			제어어 : static / final / abstract
				static : 컴파일 시에 자동 저장
			리턴형
				-> 처리 결과값
				-> 기본형(int, long, double, char, String)
				-> 자바는 리턴형을 반드시 한 개만 사용이 가능
				-> 메소드 자체 처리
					출력 / 추가 / 삭제 / 수정 -> void
				- 메소드명
					-> 식별자
						알파벳 사용, 한글 -> 알파벳 권장
						대소문자 구분
						약속 : 소문자로 시작
						숫자 사용(앞에 금지)
						키워드 사용 금지
						공백없이 사용
						-> 가급적이면 의미 부여
						------------------글자수 제한 x
							-> 데이터 추가
								insert(), update(), delete()
					- 매개변수 : 사용자 요청 데이터
						-> 가공 -> 결과값 도출
						->없는 경우 / 여러개 / 한 개
						-> 검색 요청
							-> 검색어 1개
						-> 로그인
							-> id / pw
						-> 회원가입
							-> id, pwd, name, sex, birthday...
							--------------------------------- class
						-> 정렬
							-> 배열 -> 3개 이상이면 배열 / 클래스
						-> 동작
							호출 -> 매개변수 -> 처리 -> 결과값 돌려줌
							
						-> 기본 : 재사용 / 다른 클래스 통신
								-> 반드시 한 개의 기능만 수행
								-> 최대한 세부적으로 분리
						-> static void aaa(int a){}
											int a = 10;
							: 같은 클래스에서 호출 -> aaa(10) -> 실제 값 주입
							: 다른 클래스에서 호출 -> 클래스명.aaa(20)
						-> static int aaa(int a, int b){}
							-> int a = aaa(10, 20)
						메소드를 호출할 경우
							-> 처음부터 끝까지 수행 -> 호출한 위치 원상복귀
						-> 메소드 종료
							---- return이 있는 곳에서 종료
							
							

*/
import java.util.Scanner;

/*
	난수 발생 : 임의의 수 3개 추출
	------------------------
	사용자 입력
	비교
	힌트
	종료여부
	----------------------- 메소드 5개
	-> 전체 조립
	------------------------ 1개 process()
	1. 매개변수 전송
	2. 호출 위치
	3. 다시 게임 -> 재귀호출

*/
public class 메소드_1 {


	public static void main(String[] args) {
		int[] com = new int[3];
		for(int i = 0; i < com.length; i++)
		{
			com[i] = (int)(Math.random() * 9) + 1;
			for(int j = 0; j < i; j++)
			{
				if(com[j] == com[i])
				{
					i--;
					break;
				}
			}
		}
		
		
		// 사용자 입력 받기
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력: ");
			int input = scan.nextInt();
			
			// 오류 -> 입력이 잘못된 경우
			// 1. 세자리가 아닌 경우 2. 중복된 경우 3. 0을 입력한 경우
			if(input < 100 || input > 999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			user[0] = input / 100;
			user[1] = (input / 10) % 10;
			user[2] = input % 10;
			
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2])
			{
				System.out.println("중복된 수가 있습니다.");
				continue;
			}
			if(user[0] == 0 || user[1] == 0 || user[2] == 0)
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			// 비교 -> 힌트 -> s : 같은 위치의 같은 값 / b : 다른 위치에 같은 값
			int s = 0, b = 0;
			for(int i = 0; i < com.length; i++)
			{
				for(int j = 0; j < user.length; j++)
				{
					if(com[i] == user[j])
					{
						if(i == j)
							s++;
						else
							b++;
							
					}
				}
			}
			System.out.printf("Input Number : %d, Result: %dS-%dB", input, s, b);
			if(s == 3)
			{
				System.out.println("정답입니다.");
				break;
			}
		}
	}

}
