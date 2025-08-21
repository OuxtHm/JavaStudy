package com.sist.lang;
/*
	System
	프로그램 종료(System.exit(0)) / 입출력(System.in) / 메모리 회수(System.gc()) -> static
	---------  					 ----   		   --------- 
	exit(0) : 정상 종료
	exit(0이 아닌 수)	: 비정상 종료
	** 윈도우
	** System.out.println() -> 디버깅의 기본
		




*/
public class 라이브러리_7 {

	public static void main(String[] args) {
		int a = 5;
		for(int i = 0; i < 11; i++)
		{
			if(i == a)
			{
				System.out.println("프로그램 종료");
				System.exit(0);
				//break;
			}
			System.out.println("i : " + i);
		}
		System.out.println("시작");
		System.out.println("GO");
	}

}
