/*
	형식
		(조건) ? 값1 : 값2
				--------- 프로그램에 따라 저장
				
		1. 부정 연산자
		2. 비교 연산자
		3. 논리 연산자
		-------------- true(값1) / false(값2)
		조건 
			true : 실행
			false : 무시


*/
import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		// 입력 값을 받아 홀 짝 구분
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		String str = num % 2 == 0 ? num + "는(은) 짝수입니다" : num + "는(은) 홀수입니다";
		
		System.out.println(str);*/
	
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		String str = num != 0 && num % 3 == 0 ? num + "는(은) 3의 배수입니다" : num + "는(은) 3의배수가 아닙니다";
		
		System.out.println(str);
	}

}
