// 자식 클래스로 생성하는 객체를 부모의 타입으로 받아서 객체를 생성하면 사용범위가 어떻게 되는지 말해보시오
// 이 문제는 다형성의 관계에서 부모 , 자식 클래스 자원을 어떻게 쓸 수 있는지 를 묻는 문제이다
class Person {
	String str1 = "난 부모 클래스";
	void method1() {System.out.println("에이에이에이" );}
	void ppp() {System.out.println("ppp" );}
}
class Student extends Person {
	String str2 = "난 자식 클래스";
	void method1() {System.out.println("오버라이딩 AAA");}   // 오버라이딩
	void sss() {System.out.println ("sss");}
	void superClass() {
		super.method1();
	}
}

public class Oop_Polymorphism{
	public static void main(String[] args){
		Person aaa = new Person();
		aaa.method1();
		// aaa.sss();   서브 클래스의 메소드에 접근 불가
		
		System.out.println("--------------------------------");
		Person s2 = new Student();   // 부모의 자원만 사용 가능
		System.out.println(s2.str1);
		// System.out.println(s2.str2);
		// 서브 클래스의 필드에 접근하는 방법 - 다운캐스팅
		System.out.println(((Student)s2).str2);
		s2.ppp();
		// s2.sss();
		((Student)s2).sss();
		s2.method1();   // 동적 바인딩
		
		System.out.println("--------------------------------");
		Student s1 = new Student();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		// 수퍼 클래스의 메소드를 호출하는 방법 - super
		s1.superClass();
		s1.sss();
		s1.ppp();
	}
}