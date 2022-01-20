// FarmMachine의 속성과 동작들을 가지는 클래스를 코드로 구현하고 객체를 생성하여 동작시켜보시오
// 이 문제는 어떤 사물에 대한 클래스를 실제 코드로 구현할 수 있는지를 묻는 문제이다
// 아래와 같이 결과가 나오도록 작성하시오
// 1000000 원을 가진 변수를 천단위로 콤마를 찍어서 출력시켜보시오
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
1,000,000
2020
red
Farm
machine is moving.
Fram
machine is digging.
Fram
machine is grinding.
-------------------------------------------------------------------------------------------------------------------------------*/
class FarmMachine{   // 공통적 특징(속성)만
	int price;
	int year;
	String color;
	
	void move(){
		System.out.println("Farm-machine is moving.");
	}
	void dig(){
		System.out.println("Farm-machine is digging.");
	}
	void grind(){
		System.out.println("Farm-machine is grinding.");
	}
}

public class Oop_Exam001{
	public static void main(String[] args){
		FarmMachine fm = new FarmMachine();
		// 필드 초기화
		fm.price = 1000000;
		fm.year = 2020;
		fm.color = "red";
		
		// System.out.println(fm.price);
		System.out.println(String.format("%,d", fm.price));
		System.out.println(fm.year);
		System.out.println(fm.color);
		fm.move();
		fm.dig();
		fm.grind();
	}
}