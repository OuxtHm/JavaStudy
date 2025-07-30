
public class 문제_9 {

	public static void main(String[] args) {
		int num2 = 0;
		int num3 = 0;
		for(int i = 2; i <= 12; i++)
		{
			if(i % 2 == 0)
			{
				num2 += i;
			}
			if(i % 3 == 0)
			{
				num3 +=i;
			}
		}
		System.out.println("2의 배수의 합: " + num2+ "\n3의 배수의 합: " +num3);
	}

}
