/*
	종료 -> break; return; System.exit(0)
	
	특정 부분을 제외하고 프로그램 유지, 청므부터 다시 실행
	continue : for, while, do~while
	-> for -> 증가식 이동
	-> while -> 조건식으로 이동 : 무한루프일 경우가 많다
	
	** break와 continue는 자신의 반복문에서만 가능
	for()
	{
		for()
		{
			break; 여기 for문만 break됨
		}
	}

*/
public class 제어문_1 {

	public static void main(String[] args) {
		/*for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 3; j++)
			{
				if(j == 2)
					continue;
				System.out.println("i= " + i + " \tj= " + j);
			}
		}*/
		for(int i =1; i <= 5; i++)
		{
			if(i == 3 || i == 4 || i == 5)
			{
				break;
			}
			System.out.println(i);
		}
	}

}
