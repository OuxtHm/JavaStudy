/*
	인덱스 : 0번부터 -> 값 지정의 위치
		   ------ 반복문 사용이 편리
	-> 반복문
		- 데이터값 초기화, 값 변경시 -> 일반 for
		- 출력만 처리 -> for-each(웹 데이터를 브라우저에 출력)
		
		map -> js(for-each)
		
	초기화
	입력 / 임의의 추출 -> 중요 : 저장을 몇 개 new int[5]
	검색 -> 갯수 -> 배열 생성

*/
public class 배열_4 {

	public static void main(String[] args) {
		// 초기화 -> int
		int[] arr = new int[10];
		int max = 1;
		int min = 100;
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[i] + " ");
			if (max < arr[i])
				max = arr[i];
			else if (min > arr[i])
				min = arr[i];
		}
		System.out.println("\n=========result=========");
		for(int i : arr)
		{
			// i는 인덱스 번호가 아닌 실제 저장된 값
			System.out.print(i+ " ");
		}
		System.out.println("\n최대값:" + max);
		System.out.println("최소값: " + min);

	}

}
