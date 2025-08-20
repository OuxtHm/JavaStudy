package com.sist.exception;

import java.io.*;

public class 예외처리_2 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\sist\\git\\JavaStudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception");
			int i = 0; // 한글자 읽기
			while((i = fr.read()) != -1)
			{
				System.out.println((char)i);
			}
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		finally {
			try {
				fr.close();
			} catch (Exception ex) {
			}
		}

	}

}
