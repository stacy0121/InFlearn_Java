// 다형성을 활용한 객체 생성시 배열과 반복문을 사용하여 객체를 생성해보시오
// 반복문은 향상된 for 문으로도 출력해본다
// 다형성을 이용한 객체 생성시 배열과 for 문을 통해서 자동으로 객체를 생성할 수 있는지를 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
삐뽀삐뽀~
덜컹덜컹~
씽~
-------------------------
삐뽀삐뽀~
덜컹덜컹~
씽~
-------------------------------------------------------------------------------------------------------------------------------*/
abstract class Car{
	abstract void run();
}

class Ambulance extends Car{
	void run() {System.out.println("삐뽀삐뽀~");}
}
class Cultivator extends Car{
	void run() {System.out.println("덜컹덜컹~");}
}
class SportsCar extends Car{
	void run() {System.out.println("씽~");}
}

public class Oop_Polymorphism3{
	public static void main(String[] args){
		Car[] cars = new Car[3];
		for(int i = 0; i < cars.length; i++){
			if(i == 0){
				cars[i] = new Ambulance();
				cars[i].run();
			}
			else if(i == 1){
				cars[1] = new Cultivator();
				cars[1].run();
			}
			else{
				cars[2] = new SportsCar();
				cars[2].run();
			}
		}
		
		System.out.println("--------------------------");
		for(Car c : cars){
			c.run();
		}
	}
}