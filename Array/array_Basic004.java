// 배열 요소의 값을 반복문을 사용하여 모두 출력 하시오
// 이 문제는 배열 원소의 값을 for 문과 같은 반복문을 사용하여 출력할 수 있는지 를 묻는 문제이다
/* [1] : 배열 선언과 동시에 특정 값으로 초기화
int[] sales_table = { 33, 52, 93, 100, 87
[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
33 52 93 100 87
-----------------------------------------------------------------------------------------------------------------------------*/

public class array_Basic004{
	public static void main(String[] args){
		int[] sales_table = {33, 52, 93, 100, 87};
		
		for(int i=0; i<sales_table.length; i++){
			System.out.print(sales_table[i] + " ");
		}
	}
}