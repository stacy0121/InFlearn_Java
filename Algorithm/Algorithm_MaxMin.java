// 랜덤으로 정수 10 개의 값을 갖는 배열을 만들어 최댓값과 최솟값을 같이 출력해보시오
// 이때 , 1 의 자리 정수는 0~9 사이로 한다
// 이 문제는 랜덤 숫자 생성과 최댓값 , 최솟값 알고리즘을 다 같이 사용할 수 있는지 를 묻는 문제이다
/*89 79 49 61 21 31 22 5 81 3
-----------------------------------------------------------------------------------------------------------------------------
ar 배열내 최댓값 : 89
ar 배열내 최솟값 : 3
-----------------------------------------------------------------------------------------------------------------------------*/
import java.lang.Math;

public class Algorithm_MaxMin{
	public static void main(String[] args){
		int[] ar = new int[10] ;
		
		for(int i=0; i<ar.length; i++){
			ar[i] = (int) (Math.random() * 10);   // double -> int
		}
		
		// 최소, 최댓값 가정
		int max = ar[0], min = ar[0];
		for(int i=0; i<ar.length; i++){
			max = Math.max(max, ar[i]);
			min = Math.min(min, ar[i]);
		}
		
		System.out.println("ar 배열내 최댓값 : " + max);
		System.out.println("ar 배열내 최솟값 : " + min);
	}
}