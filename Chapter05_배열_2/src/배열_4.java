/*
	66, 61, 43, 65, 77 -> 정렬 






*/
import java.util.Arrays;

public class 배열_4 {

	public static void main(String[] args) {
		int[] com = new int[5];
		
		for(int i = 0; i < com.length; i++)
		{
			com[i] = (int)(Math.random() * 100) + 1;
			
		}
		
		/*for(int i = 0; i < com.length - 1; i++)
		{
			for(int j = i; j < com.length; j++)
			{
				if(com[i] < com[j])
				{
					int temp = com[i];
					com[i] = com[j];
					com[j] = temp;
				}
			}
		}*/
		Arrays.sort(com);
		for(int i : com)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = com.length - 1; i >= 0; i--)
		{
			System.out.print(com[i] + " ");
		}
	}

}
