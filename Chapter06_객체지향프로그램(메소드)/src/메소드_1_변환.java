import java.util.Scanner;

public class 메소드_1_변환 {

	public static int input(String msg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(msg);
		int result = scan.nextInt();
		return result;		
	}
	
	static int total(int kor, int eng, int math)
	{
		return  kor + eng + math;
	}
	
	static double avg(int total)
	{
		return total / 3.0;
		
	}
	static char score(double avg)
	{
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
		return score;
	}
	static void process()
	{
		int kor = input("국어입력: ");
		int eng = input("영어입력: ");
		int math = input("수학입력: ");
		
		int total = total(kor, eng, math);
		double avg = avg(total);
		char score = score(avg);
		
		System.out.println("====== result ======");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: "+ math);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("학점: " + score);
	}
	public static void main(String[] args) {
		process();

	}

}
