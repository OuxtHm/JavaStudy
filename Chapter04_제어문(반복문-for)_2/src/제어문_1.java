/*
	while : 무한루프 -> 반복 횟수가 없는 경우
			선조건 : 한번도 수행을 못 할 수 있다.
			-> 데이터베이스 / 네트워크
			-> 무조건 종료 조건을 설정
	
	do~while : 후조건 : 무조건 한 번이상 수행
	break, continue : 바로 밑에 소스코딩이 불가능
	
	for : 반복 횟수
		-> 2차 for : 알고리즘(정렬 / 등수구하기 / 구구단...)
	배열
		int[] arr = new int[1000];
		

	반복문(for)
		for(초기값(시작); 조건; (끝))
		{
			반복 수행문장
		}



*/
public class 제어문_1 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(char c = 'A'; c <= 'Z'; c++)
		{
			System.out.print(c+ " ");
		}
		
		System.out.println();
		
		for(char c = 'Z'; c >= 'A'; c--)
		{
			System.out.print(c+ " ");
		}
		
		String s = "Hello World";
		
		System.out.println();
		
		for(int i = 0; i < s.length(); i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		System.out.println();
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			System.out.print(s.charAt(i)+ " ");
		}
		
		String html = """
				
				"""
	}

}
