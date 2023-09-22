package ch13_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 신라대학교 202095027 김하종
 * 설명 : 파일에 저장된 바이트 내용 가져오기 (출력)
 */
public class FIleInputsStreamTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("읽을 파일명을 입력하세요 : ");
		String sfile = stdIn.next();//문자열로 입력된 파일명 저장.
		
		FileInputStream fis = new FileInputStream(sfile);
		
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		fis.close();
		
		System.out.println(sfile + "파일로 부터 바이트를 읽어 화면에 출력하였였습니다.");
	}

}
