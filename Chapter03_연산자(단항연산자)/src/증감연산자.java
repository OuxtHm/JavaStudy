/*
	증감 연산자 -> 제어문(반복문) - 게임
	++ 1증가
	-- 1감소
	
	1) 전치 연산자
		++a, --a : 먼저 증감 후 다른 연산 수행
	2) 후치 연산자
		a++, a-- : 다른 연산 수행 후 증감
	ex)
		int a = 10;
		int b = ++a;
		a = 11; b = 11;
		
		int a = 10;
		int b = a++;
		a = 11; b = 10;
		
		int a = 10;
		int b = ++a + ++a;
		a = 12; b = 23
		
		int a = 10;
		int b = a++ + a++;
		a = 12; b = 21
		
		int a = 10;
		int b = ++a + a++;
		a = 12; b = 22;
		
		int a = 10;
		int b = ++a + a++ + ++a + a++;
		a = 14; b = 48;
		
		int a = 10;
		int b = a++ + a++ + ++a + a++;
		a = 14; b = 47;
		
		int a = 10;
		int b = a++ + --a + a-- + a++;
		a = 12; b = 39;
		
		int a = 10;
		int b = a-- + a-- + --a + --a;
		a = 6; b = 32;
		
		
*/
public class 증감연산자 {

	public static void main(String[] args) {
		/*
		 * int a = 10; 
		 * int b = ++a; 
		 * System.out.println("a= "+a+"    b= "+b);
		 * 
		 * int a = 10; 
		 * int a = --a; 
		 * System.out.println("a= " + a + "    b= " + b);
		 * 
		 * a = 10; 
		 * b = a--; 
		 * a++; 
		 * a--;
		 * --a; 
		 * ++a; 
		 * a++; 
		 * System.out.println(a);
		 * 
		 * a++; 
		 * a++; 
		 * a--; 
		 * System.out.println(a);
		 */

		double d = 123456.78;
		int i = 123456;
		int a1 = (int) ((d - i) * 100);
		char c = 'A';
		char c1 = c++;
		System.out.println(c);
		System.out.println(c1);
		
		/*
		 * int a = 10; 
		 * int b = a++;
		 * 
		 * a = 10; 
		 * b = ++a;
		 */
		
		
	}

}
