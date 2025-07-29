/*
	5개의 알파벳 입력 -> 
	A -> a
	b -> B

*/

import java.util.Scanner;

public class 제어문_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*for(int i = 1; i <= 5; i++)
		{
			System.out.println("알파벳 입력: ");
			String s = scan.next();
			char c = s.charAt(0);
			System.out.println("입력값: " + c);
			if(c >= 'A' && c <= 'Z')
			{
				System.out.println("변경값: " + (char)(c+32));
			}
			else
			{
				System.out.println("변경값: " + (char)(c-32));
			}
		}*/
		// 알파벳 여러 개 받아 전부 대문자로 변경 후 출력
		System.out.println("알파벳 여러개를 입력하세요");
		String str = scan.nextLine();
		
		//System.out.println(str.toUpperCase());
		/*for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z')
			{
				c -= 32;
				System.out.print(c);
			}
			else
			{
				System.out.print(c);
			}
		}*/
		
		// 문자열 입력받아 'A' | 'a'의 개수 확인
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if(c == 'a' || c == 'A')
				count++;
		}
		System.out.println(count);
	}

}
