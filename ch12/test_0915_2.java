package ch12;

class TestTest {
	private String text;
	public TestTest(String s) {
		this.text = s;
	}
}
public class test_0915_2 {
	public static void main(String[] args) {
		TestTest test = new TestTest("ABC");
		//System.out.println(test.text.toLowerCase());
		//text가 private로 선언되었기 떄문에 오류 발생
	}

}
