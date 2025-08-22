package com.sist.anno;

/*
 	@ --> Type (클래스 구분자)
	class a
	{
		@ --> Field(변수 구분자)
		B b;
		
		@ --> Constructor 
		public A()
		{
		}
		public A(@ Parameter B b)
		{
		}
		@ -->  Method
		public void disp()
		{
		}
	}
	
	-> 인덱스 -> 찾기 -> 구분자를 만든다
	  ----------------------------- 검색
	  어노테이션은 바로 밑 / 옆에 있는 것을 제어

*/

interface A
{
	void display();
}
class B implements A
{
	public void aaa()
	{
		
	}

	@Override
	public void display() {
		
	}
	
}
public class 라이브러리_어노테이션_1 {

	public static void main(String[] args) {

	}

}
