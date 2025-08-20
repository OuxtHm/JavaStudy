package com.sist.main;
import java.util.*;

class GenieMusic
{
	public void dataIn()
	{
		System.out.println("지니뮤직 크롤링");
	}
	public void list()
	{
		System.out.println("목록 출력");
	}
	public String titleFind (String fd)
	{
		System.out.println("제목으로 검색");
		return fd;
	}
}
class Melon
{
	public void dataIn()
	{
		System.out.println("멜론 크롤링");
	}
}
class Music
{
	
}


public class 정리_4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동"); // list.get(0);
		list.add("심청이"); //list.get(1);
		list.add("박문수"); //list.get(2);
		
		String name = list.get(0);
		System.out.println(name);
	}

}
