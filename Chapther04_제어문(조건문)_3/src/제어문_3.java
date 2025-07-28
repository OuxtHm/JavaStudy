import java.util.Scanner;

public class 제어문_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국 영 수 점수 입력: ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int avg = (kor + eng + math) / 3;
		
		char score = ' ';
		
		char op = ' ';
		
		if(avg >= 90)
		{
			score = 'A';
			if(avg >= 97)
				op = '+';
			else if(avg >= 94)
				op = '0';
			else 
				op = '-';
		}
		else if(avg >= 80)
		{
			score = 'B';
			if(avg >= 87)
				op = '+';
			else if(avg >= 84)
				op = '0';
			else 
				op = '-';
		}
		else if(avg >= 70)
		{
			score = 'C';
			if(avg >= 77)
				op = '+';
			else if(avg >= 74)
				op = '0';
			else 
				op = '-';
		}
		else if(avg >= 60)
		{
			score = 'D';
			if(avg >= 67)
				op = '+';
			else if(avg >= 64)
				op = '0';
			else 
				op = '-';
		}
		else
			score = 'F';
		
		System.out.println(score + "" + op);
	}
	

}
