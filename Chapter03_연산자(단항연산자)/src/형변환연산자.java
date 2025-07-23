/*
type
	(char) 65 = 'A'
	(int)10.5 = 10
	
	(double)10 = 10.0
	큰데이터형을 작은 데이터형으로 변경 : DownCasting
	
	-> 연산자
		(int)(10.5 + 10.5)
			 ------------- 우선순위
			  21
		(int)10.5 + 10.5 -> 20.5
		--------- 우선순위
		
		(int)10.5 + (int)10.5 -> 20
		---------   ---------
		
	-> 형변환 : 객체 지향에서 많이 나온다(클래스)
		*/

public class 형변환연산자 {

	public static void main(String[] args) {
		char rand = (char)((Math.random()*26) +6);
		System.out.println(rand);

	}

}
