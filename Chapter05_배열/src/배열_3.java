//성적처리

import java.util.Scanner;

public class 배열_3 {

	public static void main(String[] args) {
		final int ROWS = 3;
		Scanner scan = new Scanner(System.in);
		
		int[] kor = new int[ROWS];
		int[] eng = new int[ROWS];
		int[] math = new int[ROWS];
		
		int[] total = new int[ROWS];
		double[] avg = new double[ROWS];
		char[] score = new char[ROWS];
		
		for(int i = 0; i < ROWS; i++)
		{
			System.out.print("국어 점수 입력: ");
			kor[i] = scan.nextInt();
			System.out.print("영어 점수 입력: ");
			eng[i] = scan.nextInt();
			System.out.print("수학 점수 입력: ");
			math[i] = scan.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
			
			
			switch((int)(avg[i] / 10))
			{
			case 10, 9 -> {
				score[i] = 'A';
			}
			case 8 -> {
				score[i] = 'B';
			}
			case 7 -> {
				score[i] = 'C';
			}
			case 6 -> {
				score[i] = 'D';
			}
			default -> {
				score[i] = 'F';
			}
			}
		}
		for(int i = 0; i < ROWS; i++)
		{
			System.out.printf("%-5d %-5d %-5d %-7d %7.2f %3c\n", kor[i], eng[i], math[i], total[i], avg[i], score[i]);
		}
		
	}

}
