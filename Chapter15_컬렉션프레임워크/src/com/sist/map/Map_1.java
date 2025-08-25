package com.sist.map;

/*
	Map(인터페이스)
		- HashMap -> 비동기
		- Hashtable -> 동기  -> Hashtable을 보환 HashMap
		

	-> List : ArrayList
	-> Set : HashSet DISTINCT ORDER BY
	-> Map : HashMap  -> id:admin sex:성별 namd:홍길동
	-------------------------------------
	-> 특징
		두개를 동싱 저장 (key, value)
		-> 웹 -> 
		   MyBatis -> 키(임의로 지정), 값(클래스 주소 값)	
		   Spring -> 키(id), 값(sql)
			
		request / response / session / cookie
		-> key : 중복 허용 금지 -> 중복 오류는 없지만 덮어씌운다
		   value : 중복 이 가능
		   
		   ("id", "hong")
		   ("id", "shim") -> id 중복이므로 X
		   	-> id 값을 가지고 온다 -> shim (덮어씌우기 때문)

*/
import java.util.*;
// -> 저장(push) / 읽기(get(key))
public class Map_1 {

	public static void main(String[] args) {
		Map map = new HashMap();	// 동기 -> 쓰레드
		// Map map = new HashMap(); // 비동기 -> 일반
		/*
			ArrayList : 비동기 -> 데이터베이스 
			Vector :  쓰레드 -> 동기 -> 네트어크
			LinkedList : 파일 입출력
		
		
		*/
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("id", "hong");	// key 중복 -> 덮어쓴다
		System.out.println("ID: " + map.get("id"));
		System.out.println("PWD: " + map.get("password"));
		System.out.println("NAME: " + map.get("name"));
		System.out.println("SEX: " + map.get("sex"));
		System.out.println("AGE: " + map.get("age"));
		// 키는 대소문자 구분 -> 문자로 시작한다
		
		Set set = map.keySet();
		for(Object obj : set)
		{
			String key = (String)obj;
			System.out.println(obj + ":" + map.get(key));
		}
		/*
			claer() : 전체 삭제
			get(String key) : 값 읽기
			put() : 저장 (데이터 추가)
			idEmpty() : 데이터 존재 여부
			size() : 저장 갯수
			keySet() : key 전체를 읽는 경우
			values() : 실제 저장된 값만 
		*/
		for(Object obj : map.values())
		{
			System.out.println(obj);
		}
	}

}
