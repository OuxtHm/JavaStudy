import java.util.Scanner;

public class 메소드_2_변환 {

	static int input()	// 값 입력
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력(0 ~ 32767): ");
		int num = scan.nextInt();
		return num;
	}
	
	static int[] binary(int num)	// 처리 방법1
	{
		int[] bin = new int[16];
		// 배열 -> 뒤
		int index = bin.length - 1;
		
		while(true)
		{
			bin[index] = num % 2;
			num /= 2;
			
			if(num == 0)
				break;
			
			index--;
		}
		return bin;
	}
	static void binary(int num, int[] bin)	// 처리 방법2
	{
		
		// 배열 -> 뒤
		int index = bin.length - 1;
		
		while(true)
		{
			bin[index] = num % 2;
			num /= 2;
			
			if(num == 0)
				break;
			
			index--;
		}
	}
	static void result(int[] bin)	// 출력
	{
		System.out.println("===== result =====");
		for(int i = 0; i < bin.length; i++)
		{
			if(i % 4 == 0 && i != 0)
				System.out.print(" ");
			System.out.print(bin[i]);
		}
	}
	static void process()
	{
		int number = input();
		int[] bin = new int[16];
		binary(number, bin);
		result(bin);
		int[] bin = binary(number);
		result(bin);
	}
	
	
	public static void main(String[] args) {
		process();
	}

}
