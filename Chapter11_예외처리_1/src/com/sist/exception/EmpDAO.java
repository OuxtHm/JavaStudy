package com.sist.exception;

import java.sql.*;
import java.util.*;


public class EmpDAO {
	private Connection conn;
	private PreparedStatement ps; //오라클 -> SQL문장 전송
	private final String URL = "jdbc:oracle:thin:@211.238.142.124:1521:XE";
	private static EmpDAO dao;	// 싱글톤 -> static 디자인 패턴
	
	// 1. 시작과 동시에 오라클 드라이버 등록
	public EmpDAO()
	{
		// 초기화, 시작과 동시
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 리플렉션 -> 클래스 이름으로 메모리 할당 / 변수 / 메소드 제어
		} catch (Exception e) {
			e.printStackTrace();// -> 어느 부분에 에러 발생인지 확인 가능  // getMessage() -> 어느 위치인지 확인할 순 없음
		}
		
	}
	// 2. 싱글톤 -> 메모리 한 개만 생성
	// -> 스프링
	public static EmpDAO newInstance()
	{
		if(dao == null)
			dao = new EmpDAO();
		
		return dao;
	}
	// 3. 메소드 -> 반복제거 -> 연결 / 해제
	public void getConnection()
	{
		try
		{
			conn = DriverManager.getConnection(URL, "hr", "happy");
		}catch (Exception e) {
			// 에러메세지 -> 복구
			e.printStackTrace();
		}
	}
	public void disConnection()
	{
		try {
			if(ps != null)
				ps.close();
			if(conn != null)
				conn.close();
		} catch (Exception e) {}
	}
	// 오라클 연동
	// CRUD 읽기 쓰기 수정 삭제
	public void sawonListData()
	{
		try {
			getConnection();
			String sql = "SELECT empno, ename, job, sal, comm, deptno "; // 오라클 전송
			// 실행 결과값 받기
			// 모아서 -> 브라우저
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			disConnection();
		}
	}
}











