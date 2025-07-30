/*
	이차 for문
	for(초기값; 조건식; 증감식;)
	{
		for(초기값; 조건식; 증감식;)
		{
		
		}
	}

*/
public class 제어문_1 {

	public static void main(String[] args) {
		System.out.println("구구단을 외자");
		for(int i = 2; i < 10; i++)
		{
			for(int j = 1; j < 10; j++)
			{
				System.out.printf("%d x %d = %d\t",i, j, i * j);
			}
			System.out.println();
		}

	}

}
