package com.sist.io;
import java.io.*;
import java.net.*;
// https://www.10000recipe.com/index.html 
public class 입출력_11 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.10000recipe.com/index.html");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn != null)
			{
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true)
				{
					String s = in.readLine();
					if(s == null) break;
					System.out.println(s);
				}
				
			}
		} catch (Exception e) {}
	}
}
