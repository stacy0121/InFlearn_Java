// 자바의 인터페이스 문법을 예제 코드로 구현해보시오
// 이 문제는 자바 문법중 인터페이스에 대한 개념과 어떻게 사용하는지에 대해서 아는지를 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
씻다.
공부하다.
놀다.
엄마에게서 10000원 용돈을 받았습니다
5000원 금액을 지출했습니다 . [지출용도 -> 편의점]
[훈련비 -> 20000원 입금완료]
-------------------------------------------------------------------------------------------------------------------------------*/

class Person{
	String name;
	int age;
	int weight;
	
	Person(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void wash() {System.out.println("씻다.");}
	void study() {System.out.println("공부하다.");}
	void play() {System.out.println("놀다.");}
}

interface Allowance{
	// 상수 - public static final 키워드 생략
	String aaa = "코리아";
	int bbb = 100;
	
	// 추상메서드 - public abstract 생략
	void in(int price, String name);
	void out(int price, String name);
	// 일반 메서드는 X
}

interface Train{
	void train(int trainingPay, String name);
}

class Student extends Person implements Allowance, Train{
	Student(String name, int age, int weight){
		super(name, age, weight);
	}
	// 추상메소드 재정의
	public void in(int price, String name){
		System.out.printf("%s에게서 %d원 용돈을 받았습니다.%n", name, price);
	}
	public void out(int price, String name){
		System.out.printf("원 금액을 지출했습니다. [지출용도 -> %s]%n", price, name);
	}
	public void train(int trainingPay, String name){
		System.out.printf("[%s -> %d원 입금완료]%n", name, trainingPay);
	}
}

public class Oop_Interface{
	public static void main(String[] args){
		Student s1 = new Student("홍길동", 20, 85);
		
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "엄마");
		s1.out(5000, "편의점");
		s1.train(20000, "훈련비");
	}
}