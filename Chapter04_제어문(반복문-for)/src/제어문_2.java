/*
	for(초기값; 조건식; 증금식)
	{
		반복 수행 문장
	}

*/
// 1 ~ 100의 총합, 짝수합, 홀수함 구하기

public class 제어문_2 {

	public static void main(String[] args) {
		
		/*int sum = 0;
		int even = 0;
		int odd = 0;
		for(int i = 1; i <= 100; i++)
		{
			sum += i;
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
		}
		
		System.out.println("1~100의 총합: "+sum);
		System.out.println("1~100의 짝수합: "+even);
		System.out.println("1~100의 홀수합: "+odd);*/
		int three = 0;
		int five = 0;
		int seven = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0)
				three += i;
			if(i % 5 == 0)
				five += i;
			if(i % 7 == 0)
				seven += i;
		}
		System.out.println("1~100의 3의 배수의 합: "+three);
		System.out.println("1~100의 5의 배수의 합: "+five);
		System.out.println("1~100의 7의 배수의 합: "+seven);
	}

}
