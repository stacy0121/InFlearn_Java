// 제네릭의 개념과 필요성에 대해서 예제 코드로 설명해보시오
// 이 문제는 자바 문법중 제네릭에 대한 개념과 필요성에 대해서 알고 있는지를 묻는 문제이다
// 모든 타입을 다 받는 클래스를 만들어보시오
/*class Sample {
	private String a;
	Sample(String x ) {
		this.a = x;
	}
	public String getA () {
		return a;
	}
}
public class Collection_Generic1 {
	public static void main(String[] args){
	Sample s1 = new Sample("안녕하세요")';
	System.out.println(s1.getA());

	Sample s2 = new Sample(100);   // 에러 발생
	System.out.println(s2.getA());
	}
}*/

class Sample {
	private Object a;
	Sample(Object x) {
		this.a = x;
	}
	public Object getA() {
		return a;
	}
}
public class Collection_Generic1 {
	public static void main(String[] args){
	Sample s1 = new Sample("안녕하세요");
	System.out.println(s1.getA());

	Sample s2 = new Sample(100);
	System.out.println(s2.getA());
	
	// String str = s1.getA();
	String str = (String) s1.getA();   // 다운캐스팅 필요 
	int num = (int) s2.getA();
	
	Object str2 = s1.getA();
	// System.out.println(str2.length());   // 에러. str2이 String 타입이 아님
	System.out.println(str.length());	
	}
}