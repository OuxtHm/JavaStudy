// 사용자로부터 정수를 입력바당 양수, 음수인지 판단하는 프로그램 작성

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 한개를 입력: ");
		int num = scan.nextInt();
		
		if(num > 0)
		{
			System.out.println(num + "는 양수입니다.");
			System.out.println("절대값은: " + Math.abs(num));
		}
			
		else if(num < 0)
		{
			System.out.println(num + "는 음수입니다.");
			System.out.println("절대값은 : " + (-num));
		}
			
		
		else
			System.out.println("0입니다.");

	}

}
