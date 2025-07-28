/*
	문자 1개 난수 -> 대문자 / 소문자
*/
public class 제어문_3 {

	public static void main(String[] args) {
		int change = (int)(Math.random() * 2); // 0.0 ~ 0.99 -> 0.0 ~ 1.98 정수로 변환하여 0 , 1로 출력
		
		char c = ' ';
		if(change == 0)
			c = (char)((Math.random() * 26) + 65);	// 0 ~ 25 -> 65를 더하여 0 + 65 ~ 25 + 65	-> 대문자 출력
		else 
			c = (char)((Math.random() * 26) + 97);	// 0 ~ 25 -> 97를 더하여 0 + 97 ~ 25 + 97	-> 소문자 출력
		
		System.out.println("=====결과=====");
		
		if(c >= 'A' && c < 'Z')
			System.out.println(c + "는(은) 대문자 입니다.");
		else
			System.out.println(c + "는(은) 소문자 입니다.");
	}

}
