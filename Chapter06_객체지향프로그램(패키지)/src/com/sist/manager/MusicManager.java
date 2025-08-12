package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import com.sist.music.MusicVO;
/*
	자바 소스
	package -> 클래스가 있는 폴더명 지정 -> 한 번만 사용이 가능
	import -> 다른 패키지에 있는 클래스나 라이브러리 클래스 로드
			-> 여러번 사용이 가능
	class ClassName
	{
		사용할 변수 -> 여러개 사용
				 -> 기본형, 클래스, 배열, 클래스 배열
				 MusicVO vo;
				 MusicVO[] musics = new MusicVO[50]; -> 사용자 정의 데이터형, 일반 데이터형과 동일시 한다, 배열 / 형변환 
		---------
		생성자	-> 여러개 사용이 가능 -> 오버로딩
				-> 초기값을 다르게 저장한다면 매개변수가 있는 생성자 이용
		---------
		메소드	-> 기능별로 메소드 제작 ...
		---------
	}

	메소드
	1. 메뉴
	2. 목록 
	3. 검색(곡명)
	4. 검색(가수명)
	5. 등폭이 가장 많은 곡 
		-> 상승
		-> 하락
	1) 기능 설정 -> 자바에서는 메소드
	2) 메소드의 기능
		-> 반복 제거
		-> 기능별 코드를 분리 : 가독성
		------------------------에러처리 편리
		-> 다른 클래스에서 사용이 가능 : public 
		-> 재사용 / 수정해서 사용이 가능 (오버라이딩)
	3) 메소드 구조
		[접근지정어] 리턴형 메소드명(매개변수)
		{
			return 값;
		}
	
	1. 접근 지정어 : 메소드는 다른 클래스와 통신 : public
	2. 리턴형
		-> 기본형 : 값이 한 개인 경우
		   ----
		   	int / double / boolean / String
		-> 배열 / 클래스 : 값이 여러개인 경우
		   -- 정령 ---- 상세보기
	3. 메소드명  : 자바에서 메소드명은 주소 값
				MethodArea -> Call Stack
				
				void a(){}
				void b(){a();}
				void c(){b();}
				void d(){c();}
		-> 식별자 (변수, 메소드, 클래스, 인터페이스)
		-> 변수 / 메소드 -> 소문자로 시작
		-> 인터페이스 / 클래스 -> 대문자로 시작
			*** 두 개의 단어가 있는 경우 
				헝거리언식 표현법 사용 
				MusicManager
				Music_Manager
				MusicVO, MusicDAO, MusicDTO, MusicEntity
	4. 매개변수 : 사용자의 요청값을 받아서 처리
		매개변수(x, 여러개인 경우도 있다)
				  --------- 3개 이상 : 배열 / 클래스
		-> 갯수를 알 수 없는 경우도 있다
		----------------------- 가변 매개변수 이용
								데이터형..변수
	5. 호출 -> 메소드를 부를 경우
	   ---
	   -> 메소드 시작 ~ return이 있는 곳까지 수행	
	   
	   -> 데이터 
	   		정형화 -> 데이터베이스(검증)
	   		반정형화 -> 구분만 된 데이터 (JSON, XML, HTML)
	   		비정형화 -> 트위터, 페이스북
	
	6. 호출
		void일 경우
		- 메소드명(값...)
		
		-> static
			클래스명.메소드()
		-> instance
			객체명.메소드()
			
		class A
		{
			public void display()
			{
				this.insert(); -> this.은 생략이 가능
				insert();
				tmep(); -> static는 공용이기에 this가 없다. 생략이 아님
			}
			public static temp()
			{
				A a = new A();
				a.display()
				a.insert()
				-> 오류
			}
			public void insert()
			{
			
			}
		}
		class B
		{
			public void display()
			{
				A a = new A();
				a.display();
				a.insert();
				A.temp();
				
			}
			public static void temp()
			{
				A a = new A();
				a.display();
				a.insert();
				A.temp();
			}
			
			public int display()
			{
				1
				2
				3
				4
				5
				return 10; -> int a전송하고 종료
			}
			-> int a = display();
				6
				7
				8
				메소드는 결과값을 전송하고 소멸 -> 다음 문장 수행
			
			-> 메소드 : 어떤 값을 받을 지 -> 매개변수
			 			  결과값 설정 -> 리턴형
			 			  
			 			  
		1. 메뉴
			menu() -> 리턴형 / 매개변수
					  int 		X
		2. 목록	-> 리턴형	  / 매개변수
				  String      X
		3. 검색(곡명) -> 		리턴형        /     매개변수
			           void / MusicVO         String
		4. 검색(가수명)-> 	리턴형   /  매개변수
			          MusicVO     String	
		5. 등폭이 가장 많은 곡	-> 리턴형 : void or String, MusicVO / 매개변수 : X
			-> 상승
			-> 하락
		}
*/
public class MusicManager {
	private static MusicVO[] musics = new MusicVO[50];
	static 
	{
		// 데이터 수집 -> 초기화 블록 
		try
		{
			// 1. HTML을 저장
			Document doc =  Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			Elements etc = doc.select("table.list-wrap tr.list span.rank");
			// 태그 -> 구분 class =""(중복이 된 상태)  /  id = ""(중복없이)
			// <a class=title>제목</a>
			for(int i = 0; i < title.size(); i++)
			{
				musics[i] = new MusicVO();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				String s = etc.get(i).text();
				String state ="";
				int id = 0;
				if(s.equals("유지"))
				{
					state = "유지";
					id = 0;
				}
				else
				{
					// 1상승
					state = s.replace("[^가-힣]", "");
					id = Integer.parseInt(s.replaceAll("[^0-9]", ""));
				}
				
				musics[i].setState(state);
				musics[i].setIdcrement(id);
				
				/*System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println(etc.get(i).text());
				System.out.println("=====================");*/
				
			}
		}catch(Exception e) {}	
	}
	public static void main(String[] args) {
		MusicManager m = new MusicManager();
	
		for(MusicVO vo : musics)
		{
			System.out.println("순위: " + vo.getMno());
			System.out.println("곡명: " + vo.getTitle());
			System.out.println("가수명: " + vo.getSinger());
			System.out.println("앨범: " + vo.getAlbum());
			String state = vo.getState();
			String temp = "";
			if(state.equals("유지"))
			{
				temp = "-";
			}
			else if(state.equals("상승"))
			{
				temp = "▲" + vo.getIdcrement();
			}
			else if(state.equals("하락"))
			{
				temp = "▼" + vo.getIdcrement();
			}
			System.out.println("등폭: " + temp);
			System.out.println("===================");
			
		}
	}
	
	
}
