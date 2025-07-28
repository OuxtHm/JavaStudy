/*
	정수 한 개를 입력 받아 그 수가 3의 배수인지 판단
*/
import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		
		if(num % 3 == 0)
			System.out.println(num + "3의 배수입니다.");
		else
			System.out.println(num + "3의 배수가 아닙니다.");

	}

}
