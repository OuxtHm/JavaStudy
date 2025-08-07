import java.util.Scanner;

public class 메소드_1_변환2 {
/*
	난수 
	사용자 입력
	비교 
	종료
	
	
	절차적 언어 -> 재사용이 불가능
				소스 수정이 어려움
	-> 개선 사항
		재사용이 가능 / 게임 다시 수행
		소스들 관련 내용을 모아서 관리 -> 수정
		구조적인 프로그램    
	
	
	
	
*/
	
	static int[] com = new int[3];
	static int[] user = new int[3];
	static int s, b;
	
	static void rand()
	{
		for (int i = 0; i < com.length; i++) 
		{
			com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) 
			{
				if (com[j] == com[i]) 
				{
					i--;
					break;
				}
			}
		}
	}
	
	static void userInput()
	{
		Scanner scan = new Scanner(System.in);
		while (true) 
		{
			System.out.print("세자리 정수 입력: ");
			int input = scan.nextInt();

			// 오류 -> 입력이 잘못된 경우
			// 1. 세자리가 아닌 경우 2. 중복된 경우 3. 0을 입력한 경우
			if (input < 100 || input > 999) 
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			user[0] = input / 100;
			user[1] = (input / 10) % 10;
			user[2] = input % 10;

			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) 
			{
				System.out.println("중복된 수가 있습니다.");
				continue;
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) 
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			break;
		}
	}
	
	static void compare() 
	{
		for (int i = 0; i < com.length; i++) 
		{
			for (int j = 0; j < user.length; j++) 
			{
				if (com[i] == user[j]) 
				{
					if (i == j)
						s++;
					else
						b++;
				}
			}
			isEnd(s);
			
		}
		System.out.printf("Input Number : %d%d%d, Result: %dS-%dB", user[0], user[1], user[2], s, b);
	}
	
	
	static boolean isEnd(int s)
	{
		boolean bCheck = false;
		
		if(s == 3)
			bCheck = true;
		
		return bCheck;
	}
	
	
	static void process()
	{
		rand();
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			userInput();
			compare();
			if(isEnd(s))
			{
				System.out.println("축하합니다");
				System.out.println("게임을 다시 하시겠습니까?(y/Y : n/N)");
				char c = scan.next().charAt(0);
				if(c == 'y' || c == 'Y') 
				{
					System.out.println("새로운 게임을 실행합니다.");
					process();
				}
				else
				{
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		process();
	}

}
