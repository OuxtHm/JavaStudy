import java.util.Scanner;
public class 문제_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수입력: ");
		int num = scan.nextInt();
		System.out.println("두번째 정수입력: ");
		int num1 = scan.nextInt();
		
		int result = 1;
		
		for(int i = num; i <= num1; i++) 
		{
			result *= i;
		}
		System.out.println(result);
	}

}
