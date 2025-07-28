/*
	


*/
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수 입력: ");
		
		int kor = scan.nextInt();
		int eng= scan.nextInt();
		int math= scan.nextInt();
		int avg = (kor + eng + math) / 3;
		
		char score = 'A';
		
		/*if(avg >= 90 && avg <= 100)
			score = 'A';
		if(avg >= 80 && avg <= 90)
			score = 'B';
		if(avg >= 70 && avg <= 80)
			score = 'C';
		if(avg >= 60 && avg <= 70)
			score = 'D';
		else
			score = 'F';
		*/
		
		if(avg >= 90)
			score = 'A';
		else if(avg >= 80)
			score = 'B';
		else if(avg >= 70)
			score = 'C';
		else if(avg >= 60)
			score = 'D';
		else
			score = 'F';
	
		System.out.println(score);
	}
	

}
