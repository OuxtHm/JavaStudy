// 100개의 난수 발생(0~9) -> 빈도수 구하기
public class 배열_3 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < 100; i++) 
		{
			int rand = (int) (Math.random() * 10);
			arr[rand]++;
		}
		System.out.println("===== result =====");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(i + " : " + arr[i]);
		}
	}
}
