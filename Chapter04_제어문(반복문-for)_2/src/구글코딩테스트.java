//문자열을 입력받아 문자가 좌우 대칭여부 확인
// 모든 문자열은 짝수이다.
import java.util.Scanner;

public class 구글코딩테스트 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.print("문자열 입력(짝수)");
		str = scan.next();
		/*for(;;)
		{
			
			if(str.length() % 2 == 0)
			{
				
			}
			else
			{
				break;
			}
		}*/
		boolean bCheck = true;
		
		for(int i = 0; i < str.length() / 2; i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
			{
				bCheck = false;
				break;
			}
			
		}
		if(bCheck)
		{
			System.out.println(str+ "는(은) 좌우 대칭입니다.");
		}
		else
			System.out.println(str+ "는(은) 좌우 대칭이 아닙니다.");
	}

}
