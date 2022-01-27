// 정렬 함수를 이용하여 학생들의 성적을 1 등부터 꼴찌 까지 순위대로 출력해보시오
// 내장된 메서드를 사용하면 따로 정렬 알고리즘을 만들지 않아도 된다
// 이때 , 내림차순 으로 정렬한다
// 이 문제는 따로 정렬 알고리즘을 구현하지 않고 내장된 정렬 메서드를 사용해서 정렬해보는 문제 이다
/*88, 50, 38, 100, 90, 99, 74, 65
-----------------------------------------------------------------------------------------------------------------------------
화장실 정렬 ) 들어가기 전 = 88 50 38 100 90 99 74 65
화장실 정렬 ) 들어가기 후 = 100 99 90 88 74 65 50 38
화장실 정렬 ) 들어가기 후 = 100 99 90 88 74 65 50 38
-----------------------------------------------------------------------------------------------------------------------------*/
import java.util.Arrays;
import java.util.Collections;

public class Algorithm_SortWithMethod2{
	public static void main(String[] args){
		// 정렬에 조건(내림차순)을 설정하려면 참조형 객체(Integer) 배열이어야 함
		Integer[] scores = {88, 50, 38, 100, 90, 99, 74, 65};
		
		System.out.print("화장실(정렬) 들어가기 전 = ");
		for(int i=0; i<scores.length; i++)
			System.out.print(scores[i] + "  "); System.out.println();
		
		// 내림차순 정렬을 위해 매개변수가 필요
		Arrays.sort(scores, Collections.reverseOrder());
		
		System.out.print("화장실(정렬) 들어간 후 = ");
		for(int j=0; j<scores.length; j++)
			System.out.print(scores[j] + "  "); System.out.println();
		
		System.out.print("화장실(정렬) 들어간 후 = ");
		for(int s : scores)
			System.out.print(s + " "); System.out.println();
	}
}