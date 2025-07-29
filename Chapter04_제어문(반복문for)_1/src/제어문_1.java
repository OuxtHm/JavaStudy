/*
    for -> foreach문 for(값 : 배열){}
	for : 가장 많이 사용되는 반복문
	형식)
		for(초기값; 조건식; 증감식;)
		{
			반복 수행문장 -> 같은 형식 출력이 있는경우
		}
		1. 초기값 : 시작점 -> int i = 초기값;
						   char c = '초기값';
		2. 조건식 : 끝점 : i <= 10 or i < 100; 
		3. 증감식 : --, ++ , +=, -=
*/
public class 제어문_1 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "심청이", "김두한", "박문수", "강감찬"};
		
		/*for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}*/
		/*for(String name : names)
		{
			System.out.println(name);
		}*/
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i+ " ");
		}
		System.out.println();
		for(int i = 10; i >= 1; i--)
		{
			System.out.println(i+ " ");
		}
		System.out.println();
		for(char c = 'A'; c <= 'Z'; c++)
		{
			System.out.println(c);
		}
		System.out.println();
		for(char c = 'Z'; c >= 'A'; c++)
		{
			System.out.println(c);
		}

	}

}
