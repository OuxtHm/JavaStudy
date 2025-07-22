// 문자열 결합
/*	
 	문자열 결합 연산자 +
 	int kor = 90;
 	String result = "국어 점수: " + kor; -> 국어 점수: 90
 	6+"7" -> 67
 	7+"7"+7 -> 777
 	7+7+"7"+7+7 -> 14777
 	
*/public class 변수문자열_53p {

	public static void main(String[] args) {
		String name = "홍길동";
		String sex = "남자";
		int age = 25;
		double ki = 175.8;
		long pay = 24700000000L;
		
		System.out.println("이름: " + name);
		System.out.println("성별:" + sex);
		System.out.println("나이:" + age);
		System.out.println("키:" + ki);
		System.out.println("연봉:" + pay);
        
	}

}
