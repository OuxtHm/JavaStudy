
public class 문제_5 {

	public static void main(String[] args) {
		for(int i = 1; i < 7; i++)
		{
			for(int j = 1; j < 7; j++)
			{
				if(i + j == 6)
				{
					System.out.println("첫번째 주사위: " + i + "\t두번째 주사위: "+j);
				}
			}
		}

	}

}
