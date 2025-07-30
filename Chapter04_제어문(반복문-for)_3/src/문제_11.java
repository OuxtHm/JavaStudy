import java.util.Scanner;

public class 문제_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.println("정수 입력: ");
			int num = scan.nextInt();
			if(num % 2 == 0)
			{
				count++;
			}
		}
		
		System.out.println("입력한 정수 10개 중 짝수의 개수: " + count);
	}

}
