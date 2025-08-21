package com.sist.lang;
/*
	Wrapper
	 	기본형을 클래스화
	 	정수형
	 		byte -> Byte
	 		short -> Short
	 		int -> Integer
	 		long -> Long
	 	문자형
	 		char -> Character
	 	실수형
	 		float -> Float
	 		double -> Double
	 	논리형
	 		boolean -> Boolean
	 	문자열형
	 		char[] -> String
	 	
	 	양쪽 호환
	 		오토박싱 / 언박싱 -> 한개만 parsXxx()
	 		오토박싱 : 클래스의 값 대입
	 		언박싱 : 기본형에 클래스 객체 대입
	 		
	 		Integer ii = 10;
	 		int i = ii;
				String		String
			자바 ------> 서버 -------> 클라이언트
				 10			
				 String.valueOf(10) 
				 -> "10"
				 -> 문자열 변경
				 write(String s)
				 String read()
				 
				 정수 : Integer.parseInt("10")
				 실수 : Double.parseDouble("10.5")
				 논리 : Boolean.parseBoolean("true")
				 
				 *** 웹 / 윈도우 -> 데이터형 개념이 없다
				 				  오직 String만 가능
				 입력창
				 	JTextField
				 	<input type=text>
				 	
				 	public String boardList(HttpServelRequest req)
				 	{
				 		String page = req.getParameter("page");
				 	}
				 	public String boardList(MemberVO vo)
				 	{
				 		스프링은 알아서 값을 넣어줌
				 	}
				 	
				 
*/
import java.util.*;
public class 라이브러리_8 {

	public static void main(String[] args) {
		/*		Integer ii = new Integer(10);
				int i = ii.intValue();
				List<Integer> list = new ArrayList<Integer>();*/
		int a = 100;
		System.out.println(Integer.toBinaryString(a));	// 2진법
		System.out.println(Integer.toOctalString(a));	// 8진법
		System.out.println(Integer.toHexString(a));		// 16진법
	}

}
