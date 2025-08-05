/*
	숫자 야구 게임
	난수 -> 3 6 9
	------------
	  456 -> 1B
	  379 -> 2S
	  
	  저장 -> 배열
	  
	  1. 컴퓨터 난수 -> 중복없는 난수 -> 1 ~ 9
	  ---------------------------------
	  2. 사용자 입력
	  3. 힌트
	  4. 종료여부 -> break
	  ---------------------------반복문
*/
import java.util.Arrays;
import java.util.Scanner;

public class 배열_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com[] = new int[3];
		for(int i = 0; i < com.length; i++)
		{
			com[i] = (int)(Math.random() * 10) + 1;
			for(int j = 0; j < i; j++)
			{
				if(com[i] == com[j])
				{
					i--;
					break;
				}
			}
		}
		int[] user = new int[3];
		while(true)
		{
			System.out.println("😎 정수 3자리 입력: ");
			int input = scan.nextInt();
			if(input < 100 || input > 999)
			{
				System.out.println("😂3자리 정수를 입력하세요");
				continue;
			}
			
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			
			if(user[0] == user[1] || user[1] == user[2] || user [0] == user[2])
			{
				System.out.print("중복된 수를 입력하지마세요");
				continue;
			}
			if(user[0] == 0 || user[1] == 0 || user[2] == 0)
			{
				System.out.print("0은 입력할 수 없습니다.");
				continue;
			}
			
			int s = 0, b = 0;
			for(int i = 0; i < com.length; i++)
			{
				for(int j = 0; j < user.length; j++)
				{
					if(com[i] == user[j])
					{
						if(i == j)
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("Input Number : %d, Result: %dS - %dB\n", input, s, b);
			if(s == 3)
			{
				System.out.println("축하합니다.");
				break;
			}
			
		}

	}

}
