// 크기 5 의 정수형 배열을 선언하고 55, 88, 60, 100, 90 으로 각 요소의 값을 초기화하시오
// 이 문제는 배열 선언과 동시에 특정 값으로 초기화 할 수 있는지를 묻는 문제이다
// 이때, 2 가지 방식으로 초기화를 할 수 있는데 모두 작성해보시오
/* 아래 코드 중 틀린 것을 찾아 말해보시오
// [1]
int[] sales_table = { 55, 88, 60, 100, 90};
System.out.println( sales_table [1]);
// [2]
int[] sales_table2 = new int [] { 55, 88, 60, 100, 90};
System.out.println( sales_table2 [2]);
// [3]
int[] sales_table3;
sales_table3 = { 55, 88, 60, 100, 90 };
System.out.println ( sales_table3 [3]);
----------------------------------------------------------------------*/
// 틀린 것은 3번이다. 초기화를 직접 하는 경우 배열 선언과 생성을 한 번에 해야 한다.

public class array_Basic003{
	public static void main(String[] args){
		// [1]
		int[] sales_table = {55, 88, 60, 100, 90};
		System.out.println(sales_table[1]);
		
		// [2]
		int[] sales_table2 = new int[] {55, 88, 60, 100, 90};
		System.out.println(sales_table2[2]);
		
		// [3] 수정 
		int[] sales_table3 = {55, 88, 60, 100, 90};
		System.out.println (sales_table3[3]);
	}
}