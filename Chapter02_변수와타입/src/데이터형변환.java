/*
	변수 식별자
		- 알파벳이나 한글 시작 (한글 권장 X) -> 대소문자 구분
		- 숫자 사용이 가능 -> 앞에 사용 X
		- 특수문자 (_, $)
		- 키워드는 사용 X -> 자바에서 사용하는 단어
		- 공백 X
	변수 약속
		- 변수는 소문자로 시작
		- 3~7자리를 사용
		- 두 개의 단어 사용 -> file_name, fileName
		
	변수 선언
	데이터형 변수명 = 값 <- 초기화
	
	선언 방식
		- int a;
		  a = 10; <- 값을 저장 후에 사용
	값을 입력하는 방식
	1. 명시적 -> int a = 10;
	2. 입력값 -> int a = scan.nextInt();
	3. 난수	-> int a = (int)(Math.random());
	
	41p
	char -> 정수형 취급 :문자 / 정수 저장 O
	정수 형식
	------
	0b, 0B -> 2진법
	0 -> 8진법
	0x -> 16진법
	일반 숫자 -> 10진법
	
	51p
	문자열 타입
	char : 문자 1개
	String 변수명 = "값";
	-> 특수문자(52p)
		\t: 일정 간격 띄우기
		\n: 줄바꿈
		\": " 출력
		\\: \ 출력
	웹, 윈도우 -> 모든 데이터형 문자열    
*/
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 데이터형변환 {

	public static void main(String[] args) 
	throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("가수명 입력: ");
		String string = scan.next();
		
		
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title = doc.select("table.list-wrap a.title");
		Elements singer = doc.select("table.list-wrap a.artist");
		for(int i = 0; i < title.size(); i++) {
			String s = title.get(i).text();
			String s1 = singer.get(i).text();
			if(s1.contains(string))
				System.out.println(s+"("+s1+")");
		}

	}

}
