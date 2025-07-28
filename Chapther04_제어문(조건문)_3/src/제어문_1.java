/*
	단일조건문
		형식)
			if(조건문) : 조건문(true / false)
						-> 부정연산자(|), 비교 연산자, 논리연산자만
						{
							조건이 true일 때 수행하는 문장
							** false면 if skip
						}
	선택조건문
		형식) -> true일 때 false 일 때 나눠서 작업
			if(조건문)
			{
				조건 true 일 때 수행
			}
			else if(조건문)
			{
				조건 false 일 때 수행
			}
			***단일조건문을 독립적이다 -> if 마다 따로 수행
	
	다중조건문 : 한 개의 문장으로 만들어져 있다
				-> 조건에 맞는 문장 1개만 수행
				-> 선택문 (switch)
			if(조건문)
			{
				조건 true -> 문장 수행 -> 종료
				조건 false
			}		  |
			else if(조건문)
			{
				조건 true -> 문장 수행 -> 종료
				조건 false
			}
			else(해당 조건이 없는 경우 실행)
			{
				생략 가능
			}

*/
public class 제어문_1 {

	public static void main(String[] args) {
		int num = 15;
		if(num % 3 == 0)
			System.out.println("15는 3의 배수");
		else if(num % 5 == 0)
			System.out.println("15는 5의 배수");
		else if(num % 7 == 0)
			System.out.println("15는 7의 배수");

	}

}
