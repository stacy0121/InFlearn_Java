// 추상 클래스와 상속을 사용하여 다형성 예제를 만들어보시오
// 이 문제는 추상 클래스와 상속의 개념을 이해하고 이를 활용하여 다형성을 구현할 수 있는지를 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
앰블런스 지나가요 ~ 삐뽀삐뽀~
경운기 지나가요 ~ 덜컹덜컹~
스포츠카 지나가요 ~ 씽~
-------------------------------------------------------------------------------------------------------------------------------*/
abstract class Car{
	abstract void run();
}

class Ambulance extends Car{
	void run() {System.out.println("앰뷸런스 지나가요~ 삐뽀삐뽀~");}
}
class Cultivator extends Car{
	void run() {System.out.println("경운기 지나가요~ 덜컹덜컹~");}
}
class SportsCar extends Car{
	void run() {System.out.println("스포츠카 지나가요~ 씽~");}
}

public class Oop_Polymorphism2{
	public static void main(String[] args){
		// 추상클래스 타입의 객체를 생성할 수는 있음
		Car c1 = new Ambulance();
		Car c2 = new Cultivator();
		Car c3 = new SportsCar();
		
		c1.run();   // 동적 바인딩
		c2.run();
		c3.run();
	}
}