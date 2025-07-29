
public class 반복문문제_5 {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 2; i <= 30; i += 2) {
			count++;
			if (count == 3) {
				System.out.println(i);
				count = 0;
			} else
				System.out.print(i + " ");
		}

	}

}
