/*
	정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50 미만의 수인지 판단
*/
import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		
		if(num >= 50)
			System.out.println(num + "는 50이상입니다.");
		else
			System.out.println(num + "는 50 미만입니다.");
	
	}

}
