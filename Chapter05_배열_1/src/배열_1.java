/*
	1. 데이터 저장
		- 변수 : 한 개만 저장이 가능
		- 배열 : 같은 종류의 데이터를 여러 개 저장이 가능
		- ***클래스 : 관련된 다른 데이터형을 모아서 저장 ex) 영화 정보, 맛집 정보
			-> ~VO -> FoodVO, ~DAO -> 오라클
	---------------------------------------------------------------------
	배열 : 데이터 값을 제어 -> index / 같은 변수명을 사용 ex) arr
	
	1. 배열 선언 
		- 데이터형[] 배열명; -> 자바 형식(권장)
		- 데이터형 배열명[]; -> C 형식
	2.  배열 할당 -> 메모리에 저장
		데이터형[] 배열명 = new 데이터형[저장갯수];
		데이터형 배열명[] = new 데이터형[저장갯수];
		
		int[] arr = new int[5];
	3. 배열값 초기화
		- 기본 값 지정 : 나중에 값을 변경
		- 선언과 동시에 값 설정
			int[] arr = {1,2,3,4,5};
		- File에서 읽기 -> 초기화
		- DB에서 읽어서 초기화
		- 크롤링을 통해 초기화
		
		
		*** 배열은 인덱스를 통해 데이터 한 개씩 제어
*/
// 3명의 학생 국 / 영 / 수 점수 입력 총점 / 평균 / 등수
import java.util.Scanner;

public class 배열_1 {

	public static void main(String[] args) {
		// 배열 -> 같은 종류의 데이터가 3개 이상
		Scanner scan = new Scanner(System.in);
		
		int[] kor = new int[3];
		int[] rank = new int[3];
		
		// 필요한 데이터를 저장한다.
		for(int i = 0; i < kor.length; i++)
		{
			System.out.print((i+1) +" 국어점수 입력: ");
			kor[i] = scan.nextInt();
		}
		
		// 등수
		for(int i = 0; i < kor.length; i++)
		{
			rank[i] = 1;
			for(int j = 0; j < kor.length; j++)
			{
				if(kor[i] < kor[j])
				{
					rank[i]++;
				}
			}
		}
		
		System.out.println("===== result =====");
		
		for(int i = 0; i < kor.length; i++)
		{
			System.out.printf("%-5d %-5d\n", kor[i], rank[i]);
		}
		
		

	}

}
