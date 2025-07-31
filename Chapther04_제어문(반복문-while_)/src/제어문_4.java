import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("등급 입력(3~5)");
		
		int level = scan.nextInt();
		int bomb = (int)(Math.random() * 5) + 1;
		System.out.println(bomb);
		int success = 0;
		
		
		System.out.println("⚡⚡⚡ 폭탄 피하기 게임(1~5) 사이의 정수 입력: ");
		while(success < level)
		{
			System.out.print("정수 입력: ");
			int input = scan.nextInt();
			
			if(input < 1 || input > 5)
			{
				System.err.println("ಥ_ಥ 사용할 수 없는 숫자 입니다.");
				// 처음으로 다시 
				continue;
			}
			if(input == bomb)
			{
				System.err.println("◉_◉ Game Over 폭탄 위치는: "+bomb);
			}
			else {
				System.out.println("게임을 계속 진행하세요");
				success++;
			}
			if(success == level) {
				System.out.println("😍 Game Clear");
				break;
			}
				
			
		}
	}

}
