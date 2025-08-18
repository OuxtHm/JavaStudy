package com.sist.exception;
// try ~ catch순서

public class 예외처리_2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		// 에러 의심
		try
		{
			System.out.println(4);
			System.out.println(5);
			System.out.println(6/0);
			System.out.println(7);
		}catch(Exception e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println(9);
		System.out.println(10);
	}

}
