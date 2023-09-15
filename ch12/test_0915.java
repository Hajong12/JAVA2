package ch12;

public class test_0915 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(1) + Integer.valueOf(2); 
		//new Integer 대신 valueOf로 정수 대입
		
		switch(i) {
			case 3 :
				System.out.println("three");
				break;
			default :
				System.out.println("other");
				break;
		}
	}
	

}
