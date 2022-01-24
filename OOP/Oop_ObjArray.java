// 객체에 대한 참조값을 요소로 가지는 객체 배열을 생성하는 코드를 구현하시오
// 이 문제는 기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체 배열을 구현할 수 있는지를 묻는 문제이다
// 아래와 같이 출력하는데 다양한 방식으로 출력해보시오 . -> 3 가지 정도로
// 반복문을 사용해서 객체를 생성해보시오
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
0번 후보자 ----> 나이 : 20
1번 후보자 ----> 나이 : 21
2번 후보자 ----> 나이 : 22
3번 후보자 ----> 나이 : 23
4번 후보자 ----> 나이 : 24
5번 후보자 ----> 나이 : 25
6번 후보자 ----> 나이 : 26
7번 후보자 ----> 나이 : 27
8번 후보자 ----> 나이 : 28
9번 후보자 ----> 나이 : 29
-------------------------------------------------------------------------------------------------------------------------------*/

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// getter, setter 메소드
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
}

public class Oop_ObjArray{
	public static void main(String[] args){
		Person[] pa = new Person[10];   // 배열(참조변수) 생성
		
		for(int i = 0; i<pa.length; i++){
			pa[i] = new Person(i + "번 후보자", i+20);   // 객체 생성
			System.out.println(pa[i].getName() + " --> 나이 : " + pa[i].getAge());
		}
	}
}