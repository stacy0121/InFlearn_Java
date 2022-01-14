// 크기 5 의 정수형과 실수형 배열을 생성하고 각각의 주소 값을 출력해보시오
// 주소 값은 다른 말로 참조 값이라고도 한다
// 이 문제는 배열 변수에 들어있는 값이 참조형 타입인지에 대해서 알고 있는지를 묻는 문제이다

public class array_Basic005{
	public static void main(String[] args){
		int[] ar = {3, 3, 3, 3, 4};
		double[] ar2 = {9, 8, 2.45, 5.98, 3.14};
		System.out.println(ar);   // 선언만 되어도 주소 출력 가능(메모리 공간 차지)
		System.out.println(ar2);
	}
}