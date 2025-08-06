/*
	국 엉 수 점수를 입력받아
	총점 평균 학점 출력
*/
import java.util.*;

public class 메소드_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 입력:");
		int kor = scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng = scan.nextInt();
		
		System.out.print("수학 입력:");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		
		double avg = total / 3.0;
		
		char score = 'A';
		switch((int)avg / 10)
		{
		case 10, 9 -> {
			score = 'A';
		}
		case 8 -> {
			score = 'B';
		}
		case 7 -> {
			score = 'C';
		}
		case 6 -> {
			score = 'D';
		}
		default -> {
			score = 'F';
		}
		}
		
		System.out.println("=====result=====");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: "+ math);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("학점: " + score);
		
		
	}

}
