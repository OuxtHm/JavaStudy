/*
	자바 -> 한 개의 클래스에서 작업 X
		   클래스 여러 개를 만들어 작업
	모든 프로그램 -> Actor 
	
	선택에 따라 출력내용 변경
	--------------------
	true / false 를 나눠 작업
	-> 로그인 성공 / 실패
	-> 대문자 / 소문자
	-> 홀 / 짝
	형식)
	if(조건문) -> true ex) 짝수
	{
		문장
	}
	else -> false	ex) 홀수
	{
		문장
	}
*/
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num % 2 == 0)
			System.out.println(num + "는(은) 짝수 입니다.");
		else
			System.out.println(num + "는(은) 홀수 입니다.");
	}

}
