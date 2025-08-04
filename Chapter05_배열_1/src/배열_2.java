/*
	10개의 임의의 정수 10개 받아 최대값의 인덱스 구하기

*/

import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * 100) + 1;
			System.out.print(arr[i] + " ");
		}
		int max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("\n"+ maxIndex);
		
		// 5번째와 6번째의 값을 출력 -> 차이 확인
		System.out.printf("%d - %d = %d", arr[4], arr[5], arr[4] - arr[5]);
		
	}
	
}
