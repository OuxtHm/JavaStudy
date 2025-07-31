
/*
	문자열
	String -> 데이터형 / 클래스형 (기능-> 메소드)
	String 변수명 = "문자";
					---- 문자 제한이 없음
					
	메소드 
	- 변환 : toUpperCase() 대문자 변환
			toLowerCase() 소문자 변환
			*******valueOf() 모든 데이터형을 문자열로 변환
				   웹 / 윈도우 -> 모든 데이터형 String
				   ex) valueOf(10) -> "10"
			
		_____________________________(자주 사용X)한국에선 한글을 사용하기에
	- 비교 : equals() 실제 문자열 비교
			contains() 포함 문자열 비교
			startWith() 시작 문자열
			endWith() 끝 문자열 -> 확장자
		_____________________________
	- 검색 : indexOf() 앞에서부터 검색 ex) "Hello Java" indexOf("a") -> 7   ex) "Hello Java" indexOf("Java") -> 6 // 문자열일 경우 가장 앞이 기준
		    ㅣastIndexOf() 뒤에서부터 검색  ex) "Hello Java" ㅣastIndexOf("a") -> 9
		_____________________________
	- 제어 : substring() 문자열 자르기  -> substring(1, 5) : 1에서부터 4까지
			split 문자별 자르기
			trim() 공백문자 제거
		

*/
// substring() 예제
import java.io.*;
import java.util.*;

public class 문자열_1 {

	public static void main(String[] args) throws Exception {
		/*String msg = "Hello Java";
		// 1. 문자의 갯수 -> 공백 포함
		
		int len = msg.length();
		System.out.println("문자의 갯수: " + len);
		// 2. 자르기
		String str = msg.substring(6);
		System.out.println(str);
		
		str = msg.substring(1, 5);
		System.out.println(str);
		
		String name = "문자열_1.java";
		String subName = name.substring(name.indexOf('.')+1);
		System.out.println(subName);*/

		/*File dir = new File("c:\\javaDev");
		File[] lists = dir.listFiles();
		
		for(File f:lists)
		{
			if(f.isFile())
			{
				String ss = f.getName();
				System.out.println(ss);
				System.out.println(ss.substring(ss.lastIndexOf(".")+ 1));
			}
				
		}*/
		String msg1 = "      Hello Java!! ";
		System.out.println(msg1.length());
		String ss = msg1.trim();
		System.out.println(ss.length());
		// trim() 공백문자 제거 -> 좌우/ ID, PW /검색/ 아이디 중복체크 많이 사용

		String msg2 = "Java Oracle HTML CSS JavaScript JSP SpringFramwork VueJS SpringBoot Git GitAction Docker Doker_Compose Jenkins React Next TypeScript MSA Chatting NodeJS";

		String[] datas = msg2.split(" ");
		Scanner scan = new Scanner(System.in);
		System.out.println("단어 입력: ");
		String d = scan.next();

		for (String data : datas) 
		{
			// System.out.println(data);
			//data.startsWith(d)
			//data.endsWith(d)
			//data.contains(d)
			//data.equals(d)	-> 대소문자 구분
			if (data.equalsIgnoreCase(d))// -> 대소문자 구분 x
			{
				System.out.println(data);
			}

		}

	}

}
