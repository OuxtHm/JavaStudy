/*
	-> &&, ||
	
	(조건) && (조건)	= 결과값 /	(조건) || (조건) = 결과값
	
	&& : 범위 기간 포함	0 <= && <= 100
	|| : 범위 기간 -> 오류(잘못된 입력)	0 > || > 100
	
	&& 조건이 전부 true여야 true
	|| 조건이 하나라도 true면 true
	
	-> 오류 처리
	1. 프로그램은 반드시 시작과 동시에 오류처리
		ex) 문자열을 받아서 좌우 대칭여부 확인하는 프로그램
		 	ABBA => 0, length - 1
	2. 범위 안에 설정
	
	-> &&가 || 보다 우선순위 높음
	-> 윤년여부
		- 4년에 한 번
		- 100년마다 제외
		- 400년마다 한 번
			-> 2000 -> 2400
			-> 
	

*/
import java.util.Scanner;

/*
 
	대문자 조건 : c >= 'A' && c <= 'Z' 
	소문자 조건 : c >= 'a' && c <= 'z'
*/
public class 논리연산자 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.println("알파벳 한 개 입력: ");
		
		String str = scan.next();
		char c = str.charAt(0);
		
		System.out.println("c= " + c);
		
		if(c >= 'A' && c <= 'Z' )
			System.out.println("대문자 입니다");
		else if(c >= 'a' && c <= 'z')
			System.out.println("소문자 입니다");
		else
			System.out.println("알파벳이 아닙니다");*/
		
/*		효율적 연산
		&& -> (조건1)&&(조건2) -> 조건 1이 false면 조건2 무시 후 false 반환
*/
/*		int x = 10;
		int y = 9;
		boolean result = (x < y) && ++y == x;	// (x < y)가 false 이므로 y값 증가 X
		
		System.out.println("result: " + result);
		System.out.println("x= " + x);
		System.out.println("y= " + y);*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연도 입력: ");
		
		int year = scan.nextInt();
		String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "윤년입니다." : "윤년이 아닙니다.";
		
		System.out.println(result);
		
	}

}
