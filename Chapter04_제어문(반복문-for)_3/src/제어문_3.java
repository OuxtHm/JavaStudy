// 가위바위보 10번
import java.util.Scanner;

public class 제어문_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int win = 0;
		int lose = 0;
		int same = 0;
		
		for(int i = 0; i < 10; i++)
		{
			int com = (int)(Math.random() * 3);
			System.out.println("0: 가위 / 1: 바위 / 2: 보\n 숫자를 입력하세요");
			int user = scan.nextInt();
			
			if(user < 0 || user > 2) 
			{
				System.err.println("제대로 된 수를 입력해주세요");
				i--;
				continue;
			}
			
			int res = com - user;
			if(res == -2 || res == 1)
			{
				lose++;
				System.out.println("패배입니다.");
			}
			else if(res == 2 || res == -1) 
			{
				win++;
				System.out.println("승리입니다.");
			}
			else
			{
				same++;
				System.out.println("무승부입니다.");
			}
		}
		
		System.out.println("==========RESULT===========");
		System.out.printf("승리: %d회\t패배: %d회\t무승부: %d회", win, lose, same);
	}

}
