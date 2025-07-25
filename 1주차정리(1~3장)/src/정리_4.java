import java.util.*;


public class 정리_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("세자리 정수 입력(100 ~ 999) : ");
		int num = scan.nextInt();
		int x = num / 100;
		int y = (num % 100) / 10;
		int z = num % 10;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);

	}

}
