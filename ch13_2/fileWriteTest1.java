package ch13_2;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 신라대학교 202095027 김하종
 * 설명 : 문자를 파일에 쓰기.(저장)
 */
public class fileWriteTest1 {

	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next();
		
		//파일에 저장할 문자열 생성
		String source = "새벽에 걸려 온 너의 전화는 \n" + " 그리움 보다는 \n" + "실수였다고 난 생각할게 \n";
		
		//파일명으로 객채 생성.
		FileWriter fw = new FileWriter(sfile);
		
		//문자열을 파일에 출력.
		fw.write(source); //객체를 통해 a.txt 파일에 source에 있는 내용을 출력
		
		//출력 스트림 닫기.
		fw.close();
		
		System.out.println("파일이 생성되었습니다");
	}

}
