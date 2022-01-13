// 배열의 용도와 배열을 선언하는 방법에 대해서 작성 해보시오
// 이 문제는 배열의 개념과 역할 그리고 배열을 사용하기 위해 선언하는 방법에 대해서 아는지를 묻는 문제이다

// 자동차 판매 회사의 영업사원 100명에 대한 영업실적 배열 선언 및 크기 지정 -> 2가지 방식

public class array_Basic001{
	public static void main(String[] args){
		// 첫번째 방식
		int[] salesTable = new int[100];   // 0으로 초기화
		
		// 두번째 방식
		double[] salesTable2;
		salesTable2 = new double[100];   // 0.0으로 초기화
		
		// 선언한 배열 사용하기
		System.out.println(salesTable[0]);
		System.out.println(salesTable2[99]);
	}
}