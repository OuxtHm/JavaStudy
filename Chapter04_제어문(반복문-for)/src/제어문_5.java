
public class 제어문_5 {

	public static void main(String[] args) throws Exception{
		for(int i = 0; i < 6; i++)
		{
			int num = (int)(Math.random() * 45) + 1;
			Thread.sleep(1000);
			System.out.print(num+ " ");
		}
	}

}
