package ch12;

public class test_0915_3 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea"));
		//sb1문자열 끝에 korea를 첨부
		System.out.println(sb2.append(sb1));
		//sb2문자열 끝에 sb1(java korea)를 첨부
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2.substring(5,9));
		//sb2의 5부터 9까지 string형으로 변경
		System.out.println(sb2.delete(5,10));
		//sb2의 5에서 10까지 삭제
		System.out.println(sb2);
		System.out.println(sb1.reverse());
		//문자열을 역순으로 반환
	}

}
