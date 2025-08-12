package com.sist.music;

import lombok.*;

// 데이터 보호는 어렵다 -> 메소드를 이용해서 접근
@Data 
public class MusicVO {
	private int mno; 	// 뮤직번호
	private String title; // 곡명
	private String singer; // 가수
	private String album;
	private String state;
	private int idcrement;
	
	

}
