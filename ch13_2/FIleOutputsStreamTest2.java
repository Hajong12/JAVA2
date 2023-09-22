package ch13_2;
/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 신라대학교 202095027 김하종
 * 설명 : 바이트 단위로 파일에 저장(파일 생성)
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FIleOutputsStreamTest2 {

	public static void main(String[] args) throws IOException {
	
		
		OutputStream fos = new FileOutputStream("c.txt");
		//OutputStream : 바이트 스트림의 입출력을 위한 추상 클래스
		//FileOutputStream : 파일에 바이트 스트림의 기능 제공
		
		String str = ("자바 프로그래밍 \n문자 스트림과 바이트 스트림\n");
		
		byte[] bt = str.getBytes(); //문자열을 바아트로 변환
		
		fos.write(bt); //피일에 쓰기(저장)
		System.out.println("파일을 생성하였습니다.");
		fos.close(); //출력스트림 닫기
		
		
	}

}
