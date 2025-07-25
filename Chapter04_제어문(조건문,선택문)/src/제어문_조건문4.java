/*	
  	12, 1, 2 -> 겨울
	3, 4, 5 -> 봄
	6, 7, 8 -> 여름 
 	9, 10, 11 -> 가을
 	
 	1.사용자 입력 받기
 	2. 결과값 봄, 여름 , 가을, 겨울 중 하나 출력
*/
import java.util.Scanner;

public class 제어문_조건문4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월하는 달을 입력하시오(숫자만)");
		int number = scan.nextInt();
		
		if(number == 12 || number == 1 || number == 2)
			System.out.println("겨울");
		if(number > 2 && number < 6)
			System.out.println("봄");
		if(number > 5 && number < 9)
			System.out.println("여름");
		if(number > 8 && number < 12)
			System.out.println("가을");
		if(number < 1 || number > 12)
			System.out.println("올바르지 않은 입력입니다.");
	}

}
