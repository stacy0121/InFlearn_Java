// 자바의 반복문 종류를 열거 해보시고 각각의 기본적인 사용법을 코드로 구현 해보시오
// 이 문제는 자바의 여러 반복문 종류와 각각의 개념과 기본 사용법에 대해서 아는지를 묻는 문제이다.

// [!] 자바의 반복문 종류 -> 크게 봤을 때 4가지
// for, while, do-while, for-each(향상된 for문)
public class for_Iteration001{
	public static void main(String[] args){
		// [1] for문
		for(int i=0; i<10; i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}