// getter, setter 가 포함된 클래스의 상속을 코드로 구현해보시오
// 이 문제는 클래스의 상속을 구현시 getter, setter 의 개념과 용도를 알고 있는지 를 묻는 문제이다
// 부모 클래스 ----> Person , 자식 클래스 ----> Villain , Hero
/*
----------------------------          ----------------------------          ----------------------------
악당 이름 : 좀비                                악당 이름 : 도깨비                            악당 이름 : 몽달귀신
악당 나이 : 20 살                               악당 나이 : 30 살                              악당 나이 : 40 살
악당의 키 : 180 Cm                           악당의 키 : 175 Cm                          악당의 키 : 150 Cm
악당 체중 : 80 Kg                              악당 체중 : 70 Kg                             악당 체중 : 40 Kg 
악당 넘버 : 15001231                        악당 넘버 : 11001121                        악당 넘버 : 14001011
악당 무기 : 창                                   악당무기 : 방패                                 악당 무기 : ---
악당 파워 : 99.5                                악당 파워 : 140.5                              악당 파워 : 11.5
----------------------------          ----------------------------           ----------------------------
좀비 이동중..                                    몽달귀신 이동중..                              도깨비 이동중..*/  

class Person{
	// 캡슐화를 위해 접근권한지정
	private String name;
	private int age;
	private int height;
	private int weight;
	
	Person(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
	
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public void setWeight(int weight) {this.weight = weight;}
	public int getWeight() {return weight;}
	
	public void move() {System.out.println(" 이동중..");}	
}

class Villain extends Person{
	
	private String uniqueNumber;
	private int weapon;   // 1 : 창, 2 : 방패
	private double power;
	
	Villain(String name, int age, int height, int weight, String uniqueNumber, int weapon, double power){
		super(name, age, height, weight);
		this.uniqueNumber = uniqueNumber;
		this.weapon = weapon;
		this.power = power;
	}
	
	public void setUniqueNumber(String uniqueNumber) {this.uniqueNumber = uniqueNumber;}
	public String getUniqueNumber() {return uniqueNumber;}
	
	public void setWeapon(int weapon) {this.weapon = weapon;}
	public int getWeapon() {return weapon;}
	public String getWeaponName(int weapon){
		String weaponName;
		switch(weapon){
			case 1:
				weaponName = "창";
				break;
			case 2:
				weaponName = "방패";
				break;
			default:
				weaponName = "---";
				break;
		}
		return weaponName;
	}
	
	public void setPower(double power) {this.power = power;}
	public double getPower() {return power;}
	
	public void printPerson(){
		System.out.println("악당 이름 : " + getName());
		System.out.println("악당 나이 : " + getAge() + " 살");
		System.out.println("악당의 키 : " + getHeight() + " Cm");
		System.out.println("악당 체중 : " + getAge() + " Kg");
		System.out.println("악당 넘버 : " + getUniqueNumber());
		System.out.println("악당 무기 : " + getWeaponName(getWeapon()));
		System.out.println("악당 파워 : " + getPower());
	}
}

public class Oop_InheritanceSample2{
	public static void main(String[] args){
		Villain v1 = new Villain("좀비", 20, 180, 80, "15001231", 1, 99.5);
		System.out.println("----------------------------");
		v1.printPerson();
		System.out.print(v1.getName());
		v1.move();   // move() : 수퍼 클래스 메소드
		System.out.println("----------------------------");
		
		Villain v2 = new Villain("도깨비", 30, 175, 70, "11001121", 2, 140.5);
		System.out.println("----------------------------");
		v2.printPerson();
		System.out.print(v2.getName());
		v2.move();
		System.out.println("----------------------------");
		
		Villain v3 = new Villain("몽달귀신", 40, 150, 40, "14001011", 0, 11.5);
		System.out.println("----------------------------");
		v3.printPerson();
		System.out.print(v3.getName());
		v3.move();
		System.out.println("----------------------------");
	}
}