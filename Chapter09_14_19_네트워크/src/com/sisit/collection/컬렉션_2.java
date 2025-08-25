package com.sisit.collection;

import java.util.*;
/*
	Set<String>
	List<Integer> List<int>
				  --------
	Map<String, Object>
				 ㄴ new A(), new B()
	--------------------------------
	
	-> key, value
	  ----------- properties, xml, json
	  			  ---------------------
	  			  xml -> spring-boot : yml
	  driver = oracle...

*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

public class 컬렉션_2 {

	public static Set<String> genieMusic() 
	{
		Set<String> set = new HashSet<>();
		try {
			for(int k = 1; k <= 2; k++)
			{
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250825&hh=17&rtm=Y&pg=" + k).get();
				Elements title = doc.select("table.list-wrap a.title");
				for(int i = 0; i < title.size(); i++) 
				{
					String t = title.get(i).text();
					set.add(t);
				}
			}
			
		} catch (Exception e) {}
		return set;
	}

	public static Set<String> melonMusic() 
	{
		Set<String> set = new HashSet<>();
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for(int i = 0; i < title.size(); i++)
			{
				set.add(title.get(i).text());
			}
		} catch (Exception e) {}
		return set;
	}

	public static void main(String[] args) {
		/*
			T -> 임의의 클래스형 (Type)
			E -> 컬렉션 요소 (Element)
			K ->  key
			V -> Value
			N -> Number
			? -> 와일드 카드
				<? extends Number> -> 데이터형 한정
			
			-> 타입이 안정화 / 재사용성이 뛰어나다
			-> C#, 파이썬, TypeScript
			
		
		*/
		Set<String> genie = genieMusic();
		int i = 1;
		System.out.println("===== Genie Music Top 100 =====");
		for(String title : genie)
		{
			System.out.println(i + "." + title);
			i++;
		}
		System.out.println();
		
		Set<String> melone = melonMusic();
		System.out.println("===== Melon Music Top 100 =====");
		i = 1;
		for(String title : melone)
		{
			System.out.println(i + "." + title);
			i++;
		}
		
		// 지니뮤지에만 있는 노래 (차집합) -> removeAll
		System.out.println();
		System.out.println("===== 노래명(교집합) =====");
		// removeAll --> minus
		//Set<String> genie
		//genie.removeAll(melone); //[1,2,3,4,5].removeAll([3,4,5,6,7,8]) -> 1, 2
		//melone.removeAll(genie);
		//genie.retainAll(melone);
		System.out.println("===== Set에 있는 데이터를 List로 이동 =====");
		//List<String> list = new ArrayList<String>(genie);	// Set -> List로 이동
		// list.addAll(genie) 바로 위 코드와 같은 내용
		List<String> list = new ArrayList<>();
		list.addAll(genie);
		
		i = 1;
		for(String title : list)
		{
			System.out.println(i + "." + title);
			i++;
		}
		System.out.println("===== GenieMusic Top 10 =====");
		List<String> top = list.subList(0, 10);
		i = 1;
		for(String title : top)
		{
			System.out.println(i + "." + title);
			i++;
		}
	}

}
