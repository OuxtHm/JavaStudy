/*
	제어문 정리  /  String 정리
	배열 / 메소드
	
	제어문
	- 조건문 / 선택문
		조건문
		- 단일 조건문 : 상세보기, 아이디 중복, 유효성 검사
			** 독립적 -> 속도가 느리다
					if(영화번호 == 1)
					{
						영화 정보 출력 -> true일때만 처리
					} -> false면 종료
					
		- 선택 조건문 : 로그인, 검색, 장바구니 확인
		   있다 / 없다
		   			if(조건문)
		   			{
		   				조건이 true일 때 처리 -> 로그인 성공 / 장바구니에 상품이 존재
		   			}
		   			else
		   			{
		   				조건이 false일 때 처리 -> 로그인 실패 / 장바구니에 상품이 X
		   			}
		- 다중 조건문 : 여러가지 경우의 수
						- 한 번만 수행
						- 메뉴, 버튼
						
					
	- 반복문
	- 반복제어문


*/

import java.util.Scanner;

public class 정리_3 {

	public static void main(String[] args) {
		String[] arr = { "사과:apple", "배:pear", "밤:chestnut", "잣:pine nut", "호두:walnut", "도토리:acorn", "귤:tangerine",
				"딸기:strawberry", "파인애플:pineapple", "포도:grape", "복숭아:peach", "살구:apricot", "매실:Japanese apricot",
				"자두:plum", "키위:kiwi", "토마토:tomato", "블루베리:blueberry", "앵두:cherry", "바나나:banana", "오렌지:orange",
				"수박:watermelon", "멜론:melon", "참외:oriental melon", "망고:mango", "레몬:lemon", "석류:pomegranate",
				"자몽:grapefruit", "대추:jujub", "감:persimmon", "곶감:dried persimmon", "리치:litchi", "모과:quince",
				"오디:mulberry", "유자:citron", "무화과:fig", "호박:pumpkin", "오이:cucumber", "양파:onion", "마늘:garlic",
				"생강:ginger", "무:radish", "쑥:mugwort", "당근:carrot", "인삼:ginseng", "산삼:wild ginseng", "더덕:deodeok",
				"죽순:bamboo shoot", "파프리카:paprika", "피망:pimiento", "부추:chives", "파:green onion", "감자:potato",
				"고구마:sweet-potato", "가지:eggplant", "옥수수:corn", "후추:pepper", "고추:chili, hot pepper",
				"배추:Chinese cabbage", "양배추:cabbage", "상추:lettuce", "양상추:lettuce", "시금치:spinach", "콩:bean", "땅콩:peanut",
				"깨:sesame", "깻잎:sesame leaf", "콩나물:bean sprouts", "버섯:mushroom", "미역:seaweed" };

		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String fd = scan.next();
		
		boolean bCheck = true;
		
		for (String f : arr) 
		{
			if(f.contains(fd))	// f.startsWith(fd)
			{
				/*				
					[가-힣] 한글전체
					[0-9] 숫자 전체
					[A-Za-z] 알파벳 전체
					
					[^가-힣] !한글전체
					[^0-9] !숫자 전체
					[^A-Za-z] !알파벳 전체
					
					^[가-힣] 한글로 시작 -> ^[가-힣]{n} : 한글 n글자로 시작하는 것  
					^[0-9] 숫자 시작 -> [0-9]{n,m} 숫자 시작	: 숫자가 n ~ m개 사이로 시작하는 숫자 
					^[A-Za-z] 알파벳 시작
				*/				
				//System.out.println(f.replaceAll("[^A-Za-z]","")); -> 알파벳을 공백으로 치환
				String s = f.substring(f.indexOf(":") + 1);
				System.out.println(s);
				bCheck = true;
			}
			else
				bCheck = false;
		}
		if(!bCheck)
		{
			System.out.println("검색결과가 없습니다.");
		}

	}

}
