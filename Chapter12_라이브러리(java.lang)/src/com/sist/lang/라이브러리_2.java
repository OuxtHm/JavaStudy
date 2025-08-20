package com.sist.lang;

class Student
{
	int hakbun = 1;
	String name = "홍길동";
	public Student() {
		System.out.println("객체 생성");
	}
	public void print()
	{
		System.out.println("학번: " + hakbun);
		System.out.println("이름: " + name);
	}
	@Override	// 자동 호출 -> 객체 소멸
	protected void finalize() throws Throwable {
		System.out.println("객체 소멸!");
	}
	
}
public class 라이브러리_2 {

	public static void main(String[] args) throws Throwable {
		Student stu = new Student();
		//stu.finalize();
		stu.hakbun = 2;
		stu.name = "박문수";
		stu.print();
		
		stu = null;
		
		System.gc();
		/*stu.hakbun = 3;
		stu.name = "박문수2";
		stu.print();*/
	}

}
