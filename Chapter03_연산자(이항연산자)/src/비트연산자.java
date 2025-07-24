/*
	&		| 		^    -> 회로
			&(*)	|(+)    ^
	00		0		0		0
	01		0		1		1
	10		0		1		1
	11		1		1		0
	
	______________________________
	1100
	0101
	----&
	0100 -> 4
	
	1100
	0101
	---- |
	1101 -> 13
	
	1100
	0101
	---- ^
	1001 -> 9
	
	___________
	27 & 13
	27 | 13
	27 ^ 13
	
	11011 -> 27
	01101 -> 13
	----- &
	01001 -> 9
	
	11011 -> 27
	01101 -> 13
	----- |
	11111 -> 31
	
	11011 -> 27
	01101 -> 13
	----- 
	10110 -> 22
	
	___________
	35 & 17
	35 | 17
	35 ^ 17
	
	100011 -> 35
	010001 -> 17
	------ &
	000001 -> 1
	
	100011 -> 35
	010001 -> 17
	------ |
	110011 -> 51
	
	100011 -> 35
	010001 -> 17
	------ ^
	110010 -> 50

	비트 이동 연산자 , 비트 연산자 -> 산술 연산자

*/
public class 비트연산자 {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(27));
		System.out.println(Integer.toBinaryString(13));
		
		System.out.println(Integer.toBinaryString(35));
		System.out.println(Integer.toBinaryString(17));
		
		System.out.println(35&17);
		System.out.println(35|17);
		System.out.println(35^17);

	}

}
