package ch13;

import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdin.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdin.nextInt();
		System.out.println(num1 / num2);
	}

}
