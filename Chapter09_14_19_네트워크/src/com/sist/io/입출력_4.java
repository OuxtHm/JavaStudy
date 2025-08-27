package com.sist.io;
import java.io.*;

// 폴더 안에 있는 파일 / 폴더의 정보 확인 -> listFiles()
/*
	com.sist.model
	--------------
	BordModel
	ReserveModel
	FoodModel
	GoodModel
	MemberModel
	...
	...
	...
	
	-> 폴더 : 확장자


*/
import java.io.*;

public class 입출력_4 {

    public static void main(String[] args) {
        try {
            File dir = new File("c:\\JavaDev");
            File[] list = dir.listFiles();
            
            for (File f : list) {
                if (f.isFile()) {
                    System.out.println(f.getName() + " " + f.length() + " Bytes");
                    String s = f.getName();
                    String ext = s.substring(s.lastIndexOf(".") + 1);
                    System.out.println("확장자: " + ext);
                    } 
                if (f.isDirectory()) {
                    System.out.println(f.getName() + "[DIR]");
                }
            }
        } catch (Exception e) {}
    }
}