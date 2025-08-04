// 연산자 + 제어문

import java.util.Scanner;

public class 배열_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년 입력: ");
		int year = scan.nextInt();

		System.out.print("월 입력: ");
		int month = scan.nextInt();

		System.out.print("일 입력: ");
		int day = scan.nextInt();

		String[] strWeek = { "일", "월", "화", "수", "목", "금", "토" };

		int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 1년 1월 1일 ~ 입력된 날짜 -> 총합 % 7 -> 0 ~ 6
		// 1. 전년도까지
		int total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		// 2. 전달
		if ((year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)))
			lastDay[1] = 29;
		else
			lastDay[1] = 28;
		
		for(int i = 0; i < month-1; i++)
		{
			total += lastDay[i];
		}
		
		// 3. day
		total += day;
		int week = total % 7;
		
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n", year, month, day, strWeek[week]);
	}

}
