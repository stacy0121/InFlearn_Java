// 제네릭 (Generic) 개념과 사용법을 예제 코드로 구현해보시오
// 이 문제는 자바 문법중 제네릭에 대한 개념과 사용법에 대해서 알고 있는지 를 묻는 문제이다
/*아래의 빈칸을 제네릭으로 구성해보시오
-----------------------------------------------------------------------------------------------------------------------------
// [1] :
객체 생성 ----> String
Sample_______________ s1 = new Sample _______________( "
안녕하세요 ~"
// [2] :
객체 생성 ----> Integer
Sample _______________ s2 = new Sample _______________(100);
-------------------------------------------------------------------------------------------------------------------------------*/
class Sample<T>{
	private T obj;
	Sample(T x) {obj = x;}
	T getObj() {return obj;}
}

public class Collection_Generic2{
	public static void main(String[] args){
		Sample<String> s1 = new Sample<String> ("안녕하세요~");   // 인수인 String 타입으로 구체화
		Sample<Integer> s2 = new Sample<Integer> (100);
		
		System.out.println(s1.getObj());
	}
}