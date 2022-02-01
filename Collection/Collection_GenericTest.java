// 컴파일 단계에서는 에러가 안 나고 , 실행 단계에서 ClassCast 오류가 발생하는 상황을 만들어보시오
// 이 문제는 제네릭의 필요성을 보여주는 예를 코드로 설명할 수 있는지를 묻는 문제이다
/*class Person {
	public Object obj;
	Person(Object obj) {this.obj = obj;}
}
class Student {
	public int grade;
	Student(int grade) {this.grade = grade;}
}

public class Collection_GenericTest {
	public static void main(String[] args)
		____________________________________________
		____________________________________________
	}
}*/

class Person {
	public Object obj;
	Person(Object obj) {this.obj = obj;}
}
class Student {
	public int grade;
	Student(int grade) {this.grade = grade;}
}
class Teacher{}   // 클래스 추가

public class Collection_GenericTest {
	public static void main(String[] args)
		Person p1 = new Person(new Student());   // 인수로 객체 전달
		Teacher t1 = (Teacher) p2.obj;   // ClassCastException 발생 (런타임 오류)
	}
}
// 제너릭 -> 형변환에 편리(다운캐스팅 필요X), 컴파일 단계에서 오류 발견 가능. 