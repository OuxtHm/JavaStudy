package com.sist.exception;

/*
	다중 catch 사용
	-> 의심되는 에러를 
	
	1. 배열을 생성
	2. 문자열 정수 입력 -> 정수로 변환 -> 배열에 저장
	3. 나누기


*/
public class 예외처리_3 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		try
		{
			System.out.println(a / b);
		}
		catch(ArithmeticException e)
		{
			System.err.println("에러발생");
		}
		catch(NumberFormatException e)
		{
			System.err.println("에러발생");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("에러발생");
		}
		catch(RuntimeException e)
		{
			System.err.println("에러발생");
		}
	}

}
