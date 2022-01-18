// 메인 메서드에서 메서드로 인자 전달시 정수 100 을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정 하시오
// 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다
// a 값이 같은 결과가 나오도록 코드를 수정해보시오

public class Method_MethodCall{
	public static void sum(TestNumber a){
		// a += 400;
		// System.out.println(a);   // 100
		a.num += 400;
		System.out.println(a.num);    // 500
	}
	public static void main(String[] args){
		// int a = 100;   // 정수
		// Integer a = new Integer(100);   // wrapper 타입으로 박싱		
		TestNumber a = new TestNumber();   // 객체 생성 (정수형 대신 참조형)
		
		sum(a);   // 매개변수로 객체 주소 전달 (call by reference)
		// System.out.println(a);   // 100 (정수형으로 전달했을 때. call by value)
		System.out.println(a.num);   // 100 -> 500
	}
}

class TestNumber{
	int num = 100;
	// testNumber(int num) {this.num = num;}
	// testNumber(Integer num) {this.num = num;}
	public void testNumber(int num) {this.num = num;}   // 필드 쉐도우
}