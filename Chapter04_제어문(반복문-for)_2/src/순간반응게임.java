import java.util.Scanner;


public class 순간반응게임 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자가 5가 나오면 5를 입력 후 Enter키를 누르시오");

		Thread.sleep(2000);
		int speed = 10000;
		for(int i = 1; i <= 10; i++) {
			int num = (int)(Math.random() * 10);
			System.out.println("숫자: " + num);
			
			if(num == 5)
			{
				long start = System.currentTimeMillis();	// 현재 시간
				int user = scan.nextInt();
				long end = System.currentTimeMillis();
				if(user == 5)
				{
					System.out.println("반응시간: " + (end - start) + "ms");
					int a = (int)(end - start);
					if(speed > a)
						speed = a;
					
							
				}
				else
				{
					System.out.println("틀렸습니다.");
				}
			}
			Thread.sleep(1000);
		}
		System.out.println("당신의 최고속도: " + speed);
		
	}

}
