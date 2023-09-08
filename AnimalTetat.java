package java2023_2;

/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 202095027 김하종
 * 설명 : 추상클래스 - 동물의 울음소리를 출력하자.
 */
// 추상 클래스 - 동물
abstract class myAnimal {
	// 추상 메소드 : 동물의 소리를 반환하는 메소드
	abstract String sound();
	
	// 일반 메소드 : 동물의 기본 정보 출력하는 메소드
	void displayInfo() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 - 추상 클래스 상속
// 고양이 울음소리 반환
class myCat extends myAnimal {

	@Override
	String sound() {
		//재정의
		return "MEOW";
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("고양이 울음소리 입니다.");
	}	
	
}

public class AnimalTetat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myAnimal cat = new myCat();
		
		cat.displayInfo();
		System.out.println(cat.sound());
	}

}

