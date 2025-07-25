/*
	점수를 입력 0 ~ 100 사이
	= 60이상 합격
	= 60 이하 불합격 
*/

import java.util.Scanner;

public class 제어문_조건문7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 점수를 입력하시오");
		int num = scan.nextInt();
		if(num > 59)
			System.out.printf("점수가 %d으로 합격입니다.", num);
		if(num < 60)
			System.out.printf("점수가 %d으로 불합격입니다.", num);
		
	}

}
