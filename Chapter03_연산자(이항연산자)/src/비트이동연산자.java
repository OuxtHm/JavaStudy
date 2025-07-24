/*
	비트이동 연산자
	<< 왼쪽 이동
	>> 오른쪽 이동
	4 << 2 == 16
	x << y == x * 2^y
	4 >> 2 == 1
	x >> y == x / 2^y
	
	27 = 11011(2)
	27 << 2 = 1101100 : 108
	27 >> 2 = 110(2) -> 6
	
*/
public class 비트이동연산자 {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(27));
		System.out.println(27 << 2);
		System.out.println(27 >> 2);
	}

}
