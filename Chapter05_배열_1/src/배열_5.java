// 10개의 임의의 정수 저장 -> 총합 / 평균
public class 배열_5 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int total = 0;
		double avg = 0.0;

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * 100) + 1;
			System.out.print(arr[i] + " ");
			//total += arr[i];	// 내 방식
		}
		
		for(int i : arr)	// 강사님 방식
		{
			total += i;
		}
		
		avg = total / arr.length;
		
		System.out.printf("\n총합: %d \n평균: %.2f", total, avg);
	}
	
}
