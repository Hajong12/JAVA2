package ch13_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 신라대학교 202095027 김하종
 * 설명 : 파일에 저장된 바이트 내용 가져오기 (출력)
 */
public class FIleInputsStreamTest2 {

	public static void main(String[] args) throws IOException {
		//파일 객체 생성.
		File file = new File("c.txt");
		
		//FileReader 객체 생성
		FileReader fr = new FileReader(file);
		
		//한 문자씩 읽기
		int i;
		while((i = fr.read()) != -1) { //데이터를 모두 읽으면 -2 반환
			System.out.print((char)i);
		}
		fr.close();
		
	}

}
