// 정렬 함수를 이용하여 학생들의 성적을 꼴찌부터 1 등 까지 순위대로 출력해보시오
// 내장된 메서드를 사용하면 따로 정렬 알고리즘을 만들지 않아도 된다
// 이때 , 오름차순 으로 정렬한다
// 이 문제는 따로 정렬 알고리즘을 구현하지 않고 내장된 정렬 메서드를 사용해서 정렬해보는 문제 이다
/*88, 50, 38, 100, 90, 100, 99, 65
-----------------------------------------------------------------------------------------------------------------------------
화장실(정렬) 들어가기 전 = 88 50 38 100 90 100 99 65
화장실(정렬) 들어가기 후 = 38 50 65 88 90 99 100 100
화장실(정렬) 들어가기 후 = 38 50 65 88 90 99 100 100
-----------------------------------------------------------------------------------------------------------------------------*/
import java.util.Arrays;

public class Algorithm_SortWithMethod{
	public static void main(String[] args){
		int[] scores = {88, 50, 38, 100, 90, 100, 99, 65};
		
		System.out.print("화장실(정렬) 들어가기 전 = ");
		for(int i=0; i<scores.length; i++)
			System.out.print(scores[i] + "  "); System.out.println();   // for문이 끝나고 실행할 명령문
		
		// 정렬 - Arrays 내장 메소드. 오름차순이 기본
		Arrays.sort(scores);
		
		System.out.print("화장실(정렬) 들어간 후 = ");
		for(int j=0; j<scores.length; j++)
			System.out.print(scores[j] + "  "); System.out.println();
		
		System.out.print("화장실(정렬) 들어간 후 = ");
		for(int s : scores)
			System.out.print(s + " "); System.out.println();
	}
}