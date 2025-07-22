import java.util.*;

public class 변수데이터형연습 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// new => 메모리에 저장 / System.in 키보드 입력
		//입력 값을 받아서 저장 후 처리 -> 저장공간 : 변수
		
		System.out.print("국어 점수 입력: ");
		int kor = scanner.nextInt();
		
		System.out.print("영어 점수 입력: ");
		int eng = scanner.nextInt();
		
		System.out.print("수학 점수 입력: ");
		int math = scanner.nextInt();
		
		System.out.println("국어 점수 : " +kor);
		System.out.println("영어 점수 : " +eng);
		System.out.println("수학 점수 : " +math);
		
		// 총점 출력
		int total = kor+eng+math;
		System.out.println("총점 : "+ total);
		// 평균 출력
		double avg = total / 3.0;
		System.out.printf("평균: %.2f\n " , avg);
	}

}
