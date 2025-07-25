
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// 알파벳 -> 대문자 소문자 구분
		// 컴퓨터가 임의로 출력
		int change = (int)(Math.random() * 2);	// 0 or 1
		char c = ' ';
		if(change == 0)
			c = (char)((Math.random() * 26) + 65);
		if(change == 1)
			c = (char)((Math.random() * 26) + 97);
		
		System.out.println("=========결과==========");
		if(c >= 'A' && c <= 'Z')
			System.out.println(c + "는 대문자 입니다.");
		if(c >= 'a' && c <= 'z')
			System.out.println(c + "는 소문자 입니다.");
	}

}
