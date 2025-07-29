// 변수의 사용범위 -> 지역변수 : 메모리 자체에서 생성 / 소멸 
public class 제어문_3 {

	public static void main(String[] args) {
		char c = 'A';
		for(int i = 0; i < 26; i++)
		{
			System.out.println(c++);
		}
		
	}

}
