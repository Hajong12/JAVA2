package ch13;
import java.util.*;
/*
 * 나이를 입력받아 출력하시오
 * 입력받은 나이가 정수가 아닌 경우 예외초리 하시오
 */
public class ExceptionTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("나이를 입력하시오 : ");
		int age = 0;
		try {
			age = stdIn.nextInt();
			System.out.println("당신의 나이는 " + age +"입니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요!");
		}
		
	}

}
