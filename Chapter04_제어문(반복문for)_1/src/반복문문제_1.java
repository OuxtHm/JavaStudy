
public class 반복문문제_1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 2; i <= 100; i += 2)
		{
			sum += i;
		}
		System.out.println("1 ~ 100의 짝수의 합: "+sum);
	}

}
