/*
	사용자로부터 정수(2~9)를 받아 해당 구구단 출력


	-> 리턴형 (X) 매개변수(O)

*/

import java.util.Scanner;

public class 메소드_1 {
	
	static void gugudan(int dan)
	{
		System.out.println("사용자로부터 받은 값:" + dan);
		System.out.println("gugudan 진입");
		for(int i = 1; i < 10; i++)
		{
			System.out.println(dan + "X" + i + "=" + (i * dan));
		}
		System.out.println("gugudan 종료");
	}
	
	static void process()
	{
		System.out.println("process 진입");
		Scanner scan = new Scanner(System.in);
		System.out.print("2~9 사이의 정수 입력");
		int a = scan.nextInt();
		gugudan(a);
		System.out.println("process 종료");
	}
	
	public static void main(String[] args) {
		System.out.println("main 진입");
		process();
		System.out.println("main 종료");
	}

}
