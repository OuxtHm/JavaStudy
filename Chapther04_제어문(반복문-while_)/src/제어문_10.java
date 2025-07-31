import java.util.Scanner;

public class 제어문_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random() * 100) + 1;
		
		do
		{
			System.out.println("1~100사이의 정수 입력: ");
			int user = scan.nextInt();
			if(user < 1 || user > 100)
			{
				System.err.println("잘못된 입력값");
				continue;
			}

			if(com > user)
			{
				System.out.println("👍👍👍👍👍👍👍👍👍");
			}
			else if(com < user)
			{
				System.out.println("👎👎👎👎👎👎👎👎👎");
			}
			else
			{
				System.out.println("😎😎😎😎😎😎😎😎😎");
				break;
			}
		}while(true);
		
		
		

	}

}
