/*	
 	암호화 -> encoding -> decoding
 	시저스 암호화 -> 3칸 이동 ex) ABC -> DEF

https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDIGCAEQRRg7MgYIAhBFGDsyBwgDEAAYgAQyDQgEEAAYgwEYsQMYgAQyBggFEEUYPTIGCAYQRRg8MgYIBxBFGDzSAQgxMDM4ajBqN6gCCLACAQ&sourceid=chrome&ie=UTF-8
*/

import java.io.UnsupportedEncodingException;
import java.net.*;

public class 메소드_5 {
	static String encoder(String s) throws Exception
	{
		return URLEncoder.encode(s, "UTF-8");
	}
	static String decoder(String s) throws Exception
	{
		return URLDecoder.decode(s, "UTF-8");
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*String s = "자바";
		String en = URLEncoder.encode(s, "UTF-8");
		System.out.println(en);
		
		String ko = URLDecoder.decode(s,"UTF-8");
		System.out.println(ko);*/
		
		
	}

}
