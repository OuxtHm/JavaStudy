// 문자 저장
public class 배열_4 {

	public static void main(String[] args) {
		char[] alpah = new char[15];
		int bigCount = 0;
		int smallCount = 0;
		for(int i = 0; i < alpah.length; i++)
		{
			int a = (int)(Math.random() * 2);
			if(a == 0)
			{
				alpah[i] = (char)((Math.random() * 26) + 65);
				bigCount++;
			}
			else
			{
				alpah[i] = (char)((Math.random() * 26) + 97);
				smallCount++;
			}
				
			System.out.print(alpah[i] + " ");
		}
		System.out.printf("\n대문자 갯수 : %d \n소문자 갯수 : %d", bigCount, smallCount);
	}

}
