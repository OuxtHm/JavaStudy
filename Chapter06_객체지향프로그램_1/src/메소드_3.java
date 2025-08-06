/*
	리턴형(O) 매개변수 (사용자 요청값) (O)
		리턴형 메소드(매개변수)
	
	리턴형(O) 매개변수 (사용자 요청값) (X)
		리턴형 메소드();
		
	리턴형(X) 매개변수 (사용자 요청값) (O)
		void 메소드(매개변수)
	
	리턴형(X) 매개변수 (사용자 요청값) (X)
		void 메소드();
		
	----------------------------------
	
	void disp(int a) -> disp(10)
	int disp(int a) -> int a = disp(10);
	void disp() -> disp()
	int disp() -> int a = disp()
	
	메소드는 호출이 되면 -> 메소드 종료 후에 다시 원상 복귀
	메소드는 종료시점 

*/
public class 메소드_3 {

	static void gugudan()
	{
		for(int i = 1; i < 10; i++)
		{
			for(int j = 2; j < 10; j++)
			{
				System.out.printf("%2d * %2d = %2d\t", j, i, j * i);
			}
			System.out.println();
		}
		return; // 생략 가능
		// -> 컴파일 시에 return이 없는 경우 자동 추가
	}
	
	
	
	
	public static void main(String[] args) {
		gugudan();

	}

}
