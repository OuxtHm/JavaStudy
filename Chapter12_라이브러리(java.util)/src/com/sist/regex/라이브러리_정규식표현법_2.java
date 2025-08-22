package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class 라이브러리_정규식표현법_2 {

	public static void main(String[] args) {
		String msg = "내 전화번호는 010-1234-5678이고 " + "회사 전화번호는 02-343-5678입니다";
		String regex = "\\d{2,3}-\\d{3,4}-\\d{4}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(msg);
		
		while(m.find())
		{
			System.out.println("전화번호: " + m.group());
		}

	}

}
