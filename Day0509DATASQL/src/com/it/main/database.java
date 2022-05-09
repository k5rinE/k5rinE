package com.it.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class database {

	private Connection con; // mysql 연결
	private PreparedStatement pstmt; // sql문장 전송

	private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";

	// 드라이버 등록 : 한번만 ㄱ
	public database() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

// 연결
	public void getConnection() {
		try {

			con = DriverManager.getConnection(URL, "root", "1234"); // 경로 아뒤 비번 jdbc:mysql://localhost:3306/?user=root

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void disConnection() {
		try {
			if (pstmt != null) {
				pstmt.close();
				System.out.println("pstmt연결해제");
			}
			if (con != null) {
				con.close();
				System.out.println("con연결해제");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mydbListData() {
		try {
			// 1. Mysql 연결
			getConnection();

			// 2. 문장전송
			String sql = "select * from member";

			// 3. mysql로 sql문장 전송
			pstmt = con.prepareStatement(sql);
			
			// 4.실행결과 받아오기
			ResultSet rs = pstmt.executeQuery();
			// 5. 결과를 출력
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + " ");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}

	// 추가 인서트
	public void mydbInsert(int no, String name, String sex, String content) {
		try {
			//1 연결
			getConnection();
			//2. sql문장 작성
			String sql = "insert into member(no, name, sex, content)"
						+ "values(?,?,?,?)";
			//4. MySQl로 SQL문장 전송
			pstmt=con.prepareStatement(sql);
			//4. ????에 값을채운다
			pstmt.setInt(1,no);
			pstmt.setString(2,name);
			pstmt.setString(3,sex);
			pstmt.setString(4,content);
			
			pstmt.executeUpdate();  //db 값변동시에는 업데이트
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}

	}
	public void mydbUpdate(int no, String name1, String sex1, String content1) {
	try { 
		getConnection();
		String sql = "update member set name=?, sex=?, content=?"
						+ "where no = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name1);    // 숫자는 위에 순서대로
		pstmt.setString(2, sex1);
		pstmt.setString(3, content1);
		pstmt.setInt(4, no);
		
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		disConnection();
		
	}
	}
	//삭제
	public void mydbDelete(int no) {
		try {
			getConnection();
			String sql = "delete from member where no = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			pstmt.executeUpdate();
			
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		disConnection();
	}
	}
	public void mydbselect(String name) {
		try {
			getConnection();
			String sql = "select * from member where name=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3) + ", " + rs.getString(4) + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public static void main(String[] args) {
		database db = new database();
		db.getConnection();
		db.mydbListData();
		System.out.println("-------------------------------");
	//	db.mydbInsert(13, "최원태", "남성", "키움투수"); //중복안댐
		db.mydbUpdate(13, "1569", "ㅁ낭어ㅏ", "배구선수");
		db.mydbListData();
	//	db.mydbDelete(12);
		System.out.println("----------------------------------");
		db.mydbListData();
		System.out.println("-------------------------------------");
		db.mydbselect("김원진");
	}
}
