// 6개의 난수 -> 1 ~ 45 -> 중복이 없도록 

/*
	1. 자바 메모리 구조 (JVM)
	-----------------------------
	Method Area => static
		main /  사용자 정의 메소드 -> 
	-------------------------------
	Heap : 배열 데이터 / 클래스 데이터
				-> 프로그래머 관리 영역
				-> new / delete
				---------------delete(X) -> 자동 메모리 해제 -> 가비지 컬렉션
	---------------------------------
	Stack : 지역변수 / 매개 변수 / 참조 주소
			-> 메모리 관리 -> 자동으로 삭제
			{} 종료가 되면 자동 삭제
	
	스택 		| 		힙
	주소값	|	실제 데이터
			|
*/

import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) 
			{
				if (lotto[i] == lotto[j]) 
				{
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		for (int i = lotto.length -1; i >= 0; i--) 
		{
			System.out.print(lotto[i] + " ");
		}
	}
}
