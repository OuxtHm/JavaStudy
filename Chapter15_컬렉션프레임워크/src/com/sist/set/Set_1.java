package com.sist.set;

/*
	Set - HashSet : 중복제거 -> 코딩테스트
		- TreeSet

	1) 특징 - 순서가 없다(인덱스번호X) -> 일반 for문 사용 X for-each O, Iternater
		   - 데이터 중복 허용 X
		   - 주로 -> ArrayList에 있는 데이터 중에 중복 제거
		   - 구현된 클래스 HashSet / TreeSet
	2) 주요 기능
		- 데이터 저장 : add()
		- 데이터 삭제 : remove()
		- 데이터 읽기 : get
		- 저장된 데이터 갯수 : size()
		- 전체 삭제 : clear()
		- 존재여부 : isEmpty()
		
		ArrayList -> Set -> ArrayList
					  |
					cookie -> MyBaitis -> Spring

*/
import java.util.*;
public class Set_1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		// 데이터 추가 -> 중복된 데이터 제외
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("참외");
		set.add("귤");
		set.add("망고");
		set.add("사과");
		set.add("배");
		
		System.out.println("과일의 개수: " +set.size());
		for(Object obj : set)
		{
			System.out.println(obj);
		}
		System.out.println("===delete===");
		
		// CRUD -> 추가 / 읽기 / 수정 / 삭제
		set.remove("배");
		System.out.println("과일의 개수: " +set.size());
		for(Object obj : set)
		{
			System.out.println(obj);
		}
		System.out.println("===all clear===");
		set.clear();
		System.out.println("과일의 개수: " +set.size());
		for(Object obj : set)
		{
			System.out.println(obj);
		}
		
		if(set.isEmpty())
		{
			System.out.println("과일이 없습니다.");
		}
		else 
		{
			System.out.println("과일이 있습니다.");
		}
		// 단점 -> 객체 단위 저장 -> 같은 이름이 있는 경우에는 제거할 수 없다
		// JSP(X), Servlet(X), SPring(X)
		// websocket
		//오라클에 존재
	}

}
