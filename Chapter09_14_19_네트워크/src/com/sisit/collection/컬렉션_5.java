package com.sisit.collection;

import java.util.*;

public class 컬렉션_5 {

	public static void main(String[] args) {
		// 양방향이 가능하다
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i < 6; i++)
		{
			list.add(i);
		}
		ListIterator<Integer> it = list.listIterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");
		
		while(it.hasPrevious())
		{
			System.out.print(it.previous() + " ");
		}
		// 데이터를 한 번에 묶어서 제어
	}

}
