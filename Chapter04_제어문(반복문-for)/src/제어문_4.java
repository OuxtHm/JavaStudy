import java.util.Scanner;

public class 제어문_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2~9사이의 단을 입력: ");
		int dan = scan.nextInt();
		
		if(dan >= 2 && dan <= 9)
		{
			for(int i = 1; i <= 9; i++)
			{
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
		else
			System.out.println("구구단을 출력할 수 없습니다.");

	}

}
