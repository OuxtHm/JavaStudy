import java.util.Scanner;

public class 제어문_4 {

	public static void main(String[] args) {

		String msg = "FDASJKFLDSAH3WQKDXLLSFJHKLASS"; 
		System.out.println("문자의 총 갯수: " + msg.length());
		
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 대문자 입력: ");
		String str = scan.next();
		int index = 0;
		
		for(int i = 0; i < msg.length(); i++)
		{
			char c = msg.charAt(i);
			if(c == str.charAt(0))
			{
				index = i;
				System.out.println(str + "는" + ++index + "번에 위치합니다.");
			}
		}
	}

}
