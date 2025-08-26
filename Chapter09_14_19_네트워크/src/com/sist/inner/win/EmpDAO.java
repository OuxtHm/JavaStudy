package com.sist.inner.win;
import java.util.*;
import java.sql.*;

public class EmpDAO {
	private Connection conn;	// 오라클 연결
	private PreparedStatement ps;		// sql 문장
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static EmpDAO dao;	// 싱글톤
	
	// -> 익명 클래스 사용
	// 1. 드라이버 등록
	public EmpDAO()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	// DriverManager 제어
		} catch (Exception e) {}
	}
	// 2. 싱글톤 생성 : 모든 사용자가 한 개의 메모리 사용
	public static EmpDAO newInstance()
	{
		if(dao == null)
			dao = new EmpDAO();
		return dao;
	}
	// 3. 오라클 연결
	public void getConnection()
	{
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy"); // conn hr/happy
		} catch (Exception e) {}
	}
	// 4. 오라클 연결 종료
	public void disConnection()
	{
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
			// exit
		} catch (Exception e) {}
	}
	// 5. 기능 부여
	// 5-1. 목록 출력
	public ArrayList<EmpVo> empListData()
	{
		ArrayList<EmpVo> list = new ArrayList<EmpVo>();
		
		try {
			// 1. 연결
			getConnection();
			// 2. SQL 문장을 오라클 전송
			String sql = "SELECT empno, ename, job, hiredate FROM emp";
			ps = conn.prepareStatement(sql);
			// 3. 실행 요청
			ResultSet rs = ps.executeQuery();
			// 4. 결과값 읽기
			while(rs.next())
			{
				EmpVo vo = new EmpVo();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHireDate(rs.getDate(4));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return list;
	}
	
	// 5-2. 상세 보기
	
	
}
