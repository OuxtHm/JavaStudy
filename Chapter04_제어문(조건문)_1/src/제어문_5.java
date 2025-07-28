/*
	정수를 입력 받아 11 22 33 ... -> 같은 수 / 다른 수 입니다.
*/
import java.util.Scanner;
public class 제어문_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 자리 정수를 입력 : ");
		int num = scan.nextInt();
		
		if(num >= 10 && num <= 99)
		{
			//int a = num / 10;	// 10의 자리 저장
			//int b = num % 10;	// 1의 자리 저장
			
			if(num % 11 == 0)
				System.out.println(num + "은(는) 같은 수 입니다.");
		
				
			else
				System.out.println(num+"은(는) 다른 수 입니다.");
		}
		else
			System.out.println("잘못된 정수입니다.");
	}

}
