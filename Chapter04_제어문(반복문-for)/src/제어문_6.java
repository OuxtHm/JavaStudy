// 1~100 사이 난수 -> 사용자 입력 -> UP / Down 출력

import java.util.Scanner;

public class 제어문_6 {

	public static void main(String[] args) {
		
		/*for(int i = 1; i <= 10; i++)
		{
			System.out.println(i +" ");
		}
		System.out.println("\n======break=======");
		for(int i = 1; i <= 10; i++)
		{
			if(i == 5) break;
			System.out.println(i +" ");
		}
		System.out.println("\n======continue=======");
		for(int i = 1; i <= 10; i++)
		{
			if(i == 5) continue;
			System.out.println(i +" ");
		}*/
		
		Scanner scan = new Scanner(System.in);

		System.out.println("1 ~ 100의 숫자 고르는 중...");

		int rand = (int) (Math.random() * 100) + 1;

		System.out.println("1 ~ 100의 숫자를 입력하여 맞추시오");
		
		int count = 0;
		for (;;) {
			int num = scan.nextInt();
			count++;
			if (num > rand) {
				System.out.printf("%d보다 DOWN\n", num);
				continue;
			} else if (num < rand) {
				System.out.printf("%d보다 UP\n", num);
				continue;
			} else {
				System.out.printf("정답입니다." + count + "번 만에 맞추었습니다.");
				break;
			}

		}

	}

}
