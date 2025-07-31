
public class 제어문_8 {

	public static void main(String[] args) {
		int sum = 0; 
		for(int i = 1; i <= 100; i++)
		{
			sum += i;
		}
		System.out.println("for :"+sum);
	
		int i = 1; 
		sum = 0;
		while(i <= 100)
		{
			sum += i;
			i++;
		}
		System.out.println("while: " + sum);
		
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("do~while: " + sum);
	
	}

}
