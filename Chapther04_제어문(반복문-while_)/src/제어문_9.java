import java.util.Scanner;

public class 제어문_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("q를 입력하면 종료합니다.");
			String input = scan.next();
			if(input.equals("q"))
			{
				System.out.println("for종료");
				break;
			}
		}
		
		/*while(true)
		{
			System.out.println("q를 입력하면 종료합니다.");
			String input = scan.next();
			if(input.equals("q"))
			{
				System.out.println("while종료");
				break;
			}
			String input = "";
			
		}*/
		do
		{
			System.out.println("q를 눌러 종료");
			String input = scan.next();
			if(input.equals("q"))
			{
				System.out.println("do~while종료");
				break;
			}
		}while(true);
	}

}
