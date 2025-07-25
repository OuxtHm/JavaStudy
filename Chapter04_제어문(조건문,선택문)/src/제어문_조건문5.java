/*
	국어 영어 수학 점수 입력 
	----------
	평균 출력, 총점 출력

*/
import java.util.Scanner;

public class 제어문_조건문5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력:");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int total = kor + eng + math;
		int avg = (kor + eng + math) / 3;
		
		System.out.printf("총점은 %d점입니다.\n", total);
		System.out.printf("평균은 %d점입니다.\n", avg);
		
		
		if(avg <= 100 && avg >= 90)
			System.out.println("A");
		if(avg <= 89 && avg >= 80)
			System.out.println("B");
		if(avg <= 79 && avg >= 70)
			System.out.println("C");
		if(avg <= 69 && avg >= 60)
			System.out.println("D");
		if(avg < 59)
			System.out.println("F");
		
		

	}

}
