import java.util.Scanner;

public class 제어문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 한 개 입력: ");
		
		String str = scan.next();
		char c = str.charAt(0);
		if(c >= 'A' && c <= 'Z')
		{
			System.out.println(c+"은 대문자 입니다.");
		}
		else if(c >= 'a' && c <= 'z')
		{
			System.out.println(c+"은 소문자 입니다.");
		}
		else if(c >= '0' && c <= '9')
		{
			System.out.println(c+"은 숫자입니다.");
		}
		else
		{
			System.out.println("알파벳이나 숫자를 입력해주세요");
		}
	}

}
