import java.util.Scanner;

public class 문제_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count3 = 0;
		int count5 = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.println("정수 입력: ");
			int num = scan.nextInt();
			if(num % 3 == 0)
			{
				count3++;
			}
			if(num % 5 == 0)
			{
				count5++;
			}
		}
		
		System.out.println("3의 배수의 개수: " + count3 +"\n5의배수의 개수: "+ count5);
	}


}
