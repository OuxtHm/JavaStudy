
public class 제어문_2 {

	public static void main(String[] args) {
		int max = 1;
		int min = 100;
		
		for(int i = 0; i < 10; i++)
		{
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num+ " ");
			
			if(max < min)
				max = num;
			if(min > num)
				min = num;
		}
		System.out.println();
		System.out.println("==========result===========");
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

	}

}
