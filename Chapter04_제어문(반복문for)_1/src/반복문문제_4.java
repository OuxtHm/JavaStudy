import java.util.Scanner;

public class 반복문문제_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 개의 정수를 입력하세요");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++)
		{
			sum += i;
		}
		System.out.printf("1부터 %d까지의 총합: %d", num, sum);
	}

}
