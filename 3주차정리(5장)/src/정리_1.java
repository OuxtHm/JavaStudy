/*
	기본
	
	2) 데이터형
		기본형 : 메모리에 데이터형
			정수 저징
			byte -> 8bit -> 네트워크 송수신 / 웹
			int -> 32bit -> 일반 정수 -> default
			long -> 64bit : 금융권 / 증권
			실수저장
			double -> 64bit -> 소수점 15자리 -> 일반실수 -> 건축 -> 정밀도
			논리 저장
			boolean -> 8bit -> 조건 / 반복
			문자저장 
			char -> 16bit -> 양수만 사용 0 ~ 65535
			------------------------------------------------------
			참조형 : 여러개 데이터를 저장하는 경우 -> 주소
					-------------- 배열 / 클래스
										----- String 문자열
			**String : 문자열 여러개 저장
			  클래스형 -> 메소드 지원
			  - 비교 
			  	1)*** equals :  대소문자 구분 비교 -> 로그인 / 회원가입
			  				** boolean equals(String s) 
			  	2)*** contains : 대소문자 구분 -> 포함여부 -> 검색
			  				** boolean equals(String s)
			  	3)*** startsWith : 대소문자 구분 -> 시작 문자열 자동 완성기 / 쿠키찾기
			  				** boolean startsWith(String s)
			  	4) endsWith : 대소문자 구분 -> 끝 문자열 -> 이미지 확장자
							** boolean endWith(String s)
			
			제어
			1) substring : 자르기
				-> CSS
				-> 우편번호 / 주소 / 생성AI
				-> 오버로딩 : 같은 이름의 메소드가 여러개 존재 
							- 메소드 명이 동일 
							- 리턴형과 관계없다
							- 매개변수의 데이터형이 다른경우
							- 비슷한 기능
				** 원형
				String substring(int beginIndex) : 지정된 위치에서 마지막 문자까지 자른다
				-> 웹에서 필요한 곳 : MVC
				-> 브라우저에서 서버연결 : URL주소 login.jsp?id=aaa&pwd=1234
				** String substring(int beginIndex, endIndex) : beginIndex ~ endIndex-1위치까지 자른다
				** 문자열의 원형은 변경되지 않는다.
			찾기
				indexOf : 지정된 문자, 문자열의 인덱스 번호 확인 -> 앞에서부터
					int indexOf(char c)
					int indexOf(String s)
				lastIndexOf : 지정된 문자, 문자열의 인덱스 번호 확인 -> 뒤에서부터
					int lastIndexOf(char c)
					int lastIndexOf(String s)
		자바:	https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUqDwgAEEUYOxiDARixAxiABDIPCAAQRRg7GIMBGLEDGIAEMgYIARBFGDsyBggCEEUYOzINCAMQABiDARixAxiABDIHCAQQABiABDIGCAUQRRg9MgYIBhBFGDwyBggHEEUYPNIBCDIyMTNqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8
			변환
				replace : 문자 / 문자열
					String replace(char c, char c1) -> c : 찾는 문자 , c1 : 변경할 문자 ex) replace(a , b) -> java -> jbvb
					String replace(String s, String s1) -> s : 찾는 문자열, s1 : 변경할 문자열 ex) replace(ja , va) -> Hello vava
					-> 오라클에 데이터 추가
					URL 주소 -> 입력 -> 크롤링 오라클에 첨부 -> 네트워크에서 채팅 -> \n -> \t
				replaceAll : 문자 / 문자열 -> 정규식
					String replaceAll(String regex, String s)
				
				trim : 공백문자
					-> 좌우의 공백문자
					-> String trim()
					-> 로그인 / 회원가입 / 글쓰기 / 검색
				
				valueOf : 모든 데이터형을 문자열 변환
				
				192.168.10.1 [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
				192.168.10.2
				192.168.10.3
				192.168.10.4
				192.168.10.5
				192.168.10.6
				192.168.10.7
				1111-1111	
				555.555.555
				666.666.1
				
				맛있는 맛있고 맛집이고....
				맛있+
				
				오늘 날씨와 추천하는 점심 추천
				




*/
public class 정리_1 {

	public static void main(String[] args) {
		/*String url = "http://localhot:8080/member/login/jsp?id=admin&pwd=1234";
		String s = url.substring(url.lastIndexOf("/") + 1 , url.indexOf("?"));
		System.out.println(s);
		
		s = url.substring(url.indexOf("=") + 1, url.indexOf("&"));
		System.out.println(s);
		
		s = url.substring(url.lastIndexOf("=") +1);
		System.out.println(s);*/
		
		
		String ss = "blue|black|yellow|pink|green";
		String [] data = ss.split("\\|");
		for(String s : data)
		{
			System.out.println(s);
		}
	}

}
