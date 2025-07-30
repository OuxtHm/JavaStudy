
public class 문제_10 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 4; i <= 100; i += 4)
		{
			sum += i;
		}
		System.out.println("1~100까지 정수 중 4의 배수의 합: " + sum);
	}

}
