/*
	do~while : 자바에서 사용 빈도 X
	-> while의 단점 보완
		--- 실행하지 않는경우가 있는데 do~while은 반드시 한 번은 수행
		while : 먼저 조건 처리
		do~while : 나중에 조건 처리
		
	형식)
		초기값
		while(조건식)
		{
			반복 수행문장
			증감식
		}
		do
		{
			반복실행
			증감식
		}while(조건식);


*/
public class 제어문_7 {
	public static void main(String[] args) {
		
		System.out.println("for");
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("\nwhile");
		int i = 1;
		while (i <= 10)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\ndo while");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= 10);
	}
}
