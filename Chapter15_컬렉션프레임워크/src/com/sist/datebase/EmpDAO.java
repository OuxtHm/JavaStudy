package com.sist.datebase;
// 오라클 연동
import java.util.*;
import java.sql.*;

/*
	폴더 -> 데이터베이스
	파일 -> 테이블


*/
public class EmpDAO {
	private Connection conn;	// 연결
	private PreparedStatement ps;	// SQL 문장 전송
	private final String URL = "jdbc:oracle:thin:@211.238.142.124:1521:XE";	// properties
	
	public EmpDAO()
	{
		try {
			Class.forName("oracal.jdbc.dirver.OracleDriver");
		} catch (Exception e) {}
	}
	// 2. 반복 제거
	// 연결 = 해제
	public void getConnection()
	{
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
		} catch (Exception e) {
			
		}
	}
	public void disConnection()
	{
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			
		}
	}
	public ArrayList empListData()
	{
		ArrayList list = new ArrayList();
		// 윈도우, 콘솔, 브라우저, 핸드폰
		try {
			// 데이터베이스 연결
			getConnection();
			// 오라클 명령어 전송 -> CRUD
			/*
				CI/CD
				-> GIT -> Git Action / Docker
				-> AWS로 명령어 전송
			*/
			 String sql = "SELECT empno, ename, job, sal FROM emp";
			 ps = conn.prepareStatement(sql);
			 // 결과값 읽기
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 EmpVO vo = new EmpVO();
				 vo.setEmpno(rs.getInt(1));
				 vo.setEname(rs.getString(2));
				 vo.setJob(rs.getString(3));
				 vo.setSal(rs.getInt(4));
				 list.add(vo);
			 }
			 rs.close();
		} catch (Exception e) {
			// 에러확인
			e.printStackTrace();
		}
		finally
		{
			// 데이터베이스 연결 해제
			disConnection();
		}
		return list;
	}
}
