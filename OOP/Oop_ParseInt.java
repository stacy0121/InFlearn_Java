// 문자열을 숫자로 바꿔서 연산해보시오
// 이때 , 인자값으로 진수를 지정해서 출력해보시오
// 이 문제는 자바 프로그래밍시 문자열을 숫자로 변환시키는 것에 대해서 아는지를 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
1 + 2 = 3
1 + 2 = 12
-------------------------[진수 지정]
2022
2022
1
9
516
10
15
255
-------------------------[진수 지정]
-------------------------------------------------------------------------------------------------------------------------------*/
public class Oop_ParseInt{
	public static void main(String[] args){
		// int a = 1;
		// int b = 2;
		// System.out.println("1 + 2 = " + (a+b));
		
		String a1= "1";
		String b1 = "2";
		String c1 = a1 + b1;
		int a2 = Integer.parseInt(a1);   // Integer 클래스의 static 메서드
		int b2 = Integer.parseInt(b1);
		
		System.out.println("1 + 2 = " + (a2 + b2));
		System.out.println();
		System.out.println("1 + 2 = " + c1);
		System.out.println(c1.getClass().getName());   // 자료형을 알려줌
		
		System.out.println("-------------------------[진수 지정]");   // 10진수
		System.out.println(Integer.parseInt("2022"));         // 2022
		System.out.println(Integer.parseInt("2022", 10));    // 인수를 하나 더 추가하여 진수 설정
		System.out.println(Integer.parseInt("1", 8));           // 1
		System.out.println(Integer.parseInt("1001", 10));    // 9
		System.out.println(Integer.parseInt("1004", 8));      // 516
		System.out.println(Integer.parseInt("A", 16));         // 10
		System.out.println(Integer.parseInt("D", 16));         // 15
		System.out.println(Integer.parseInt("FF", 16));       // 255
		System.out.println("-------------------------[진수 지정]");
	}
}