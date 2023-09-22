package ch13_2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 신라대학교 202095027 김하종
 * 설명 : 파일에 저장된 내용 가져오기 (출력)
 */

public class FileReaderTest1 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner stdIn = new Scanner(System.in);
			System.out.print("읽을 파일명을 입력하세요 : ");
			String sfile = stdIn.next();//문자열로 입력된 파일명 저장.
			
			//읽어들일 파일명으로 객체 생성.
			FileReader fr = new FileReader(sfile);
			//한 문자씩 읽기
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (FileNotFoundException e) { //예외처리는 필수
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("읽어 들일 파일이 없습니다.");
		}
		
	}

}
