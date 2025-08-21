package com.sist.util;

import java.util.*;
import java.sql.*;

public class 라이브러리_StringTokenizer_3 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.124:1521:XE"; 
			Connection conn = DriverManager.getConnection(url, "hr_1", "happy");
			String sql = "select name, theme from food_menupan where theme like '%어른과 함께라면%'";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		
			while(rs.next())
			{
				String name = rs.getString(1);
				String theme = rs.getString(2);
				System.out.println(name);
				/*System.out.println(theme);*/
				StringTokenizer st = new StringTokenizer(theme, ",");
				while(st.hasMoreElements())
				{
					System.out.println(st.nextToken());
				}
			}
			
			rs.close();
			ps.close();
			conn.close();
					
		} catch (Exception e) {}

	}

}
