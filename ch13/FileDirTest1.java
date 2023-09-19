package ch13;
import java.io.File;
public class FileDirTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "C:/Windows";
		File f1 = new File(dir); //파일겍체생성
		
		if(f1.isDirectory()) {
			System.out.println("검색 디렉터리 : " + dir);
			System.out.println("============================");
			
			//디렉터리의 모든 요소를 문자열의 배열로 생성;
			String s[] = f1.list();
			
			for(int i = 0; i < s.length; i++) {
				//문자열의 항목으로 객체 생성.
				File f = new File(dir + "/" + s[i]);
				if(f.isDirectory()) {
					System.out.println(s[i] + ": 디렉터리");
				}
				else {
					System.out.println(s[i] + " : 파일");
				}
			}
		}
		else {
			System.out.println("지정한" + dir + "는 디렉터리가 아닙니다.");
		}
	}

}
