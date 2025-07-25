/*
	알파벳 입력 받아 대문자 소문자 알파벳이 아님을 구분(단일 조건으로)

*/
import java.util.Scanner;
public class 제어문_조건문6 {

	public static void main(String[] args) {
		System.out.println("알파벳을 입력하시오(여러 글자 입력 시 첫번째 글자 입력)");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		char c = str.charAt(0);
		
		if(c >= 'A' && c <= 'Z')
			System.out.println(c + "는 대문자 입니다.");
		if(c >= 'a' && c <= 'z')
			System.out.println(c + "는 소문자 입니다.");
		if(!(c >= 'A' && c <= 'Z') || !(c >= 'a' && c <= 'z'))
			System.out.println("알파벳이 아닙니다.");
	}

}