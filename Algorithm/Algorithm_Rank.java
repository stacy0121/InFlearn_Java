// 학생들의 성적을 1등 부터 순위를 매겨서 출력해보시오
// 이 문제는 순위 (Ranking) 알고리즘에 대해서 알고 있는지를 묻는 문제이다
// 이때, 성적 배열의 점수를 오름차순으로 정렬해서 출력시키고 옆에 등수를 표시하시오
/*88, 50, 38, 100, 90, 100, 99, 65
-----------------------------------------------------------------------------------------------------------------------------
총 8명 학생의 성적과 등수는?
88점 --> 5 등 50 점 --> 7 등 38 점 --> 8 등 100 점 --> 1 등 90 점 --> 4 등 100 점 --> 1 등 99 점 --> 3 등 65 점 --> 6 등
38점 ----> 8 등 50 점 ----> 7 등 75 점 ----> 6 등 88 점 ----> 5 등 90 점 ----> 4 등 99 점 ----> 3 등 100 점 ----> 1 등 100 점 ----> 1 등
-------------------------------------------------------------------------------------------------------------------------------*/
import java.util.Arrays;

public class Algorithm_Rank{
	public static  void main(String[] args){
		int[] scores = {88, 50, 38, 100, 90, 100, 99, 65};
		int s_len = scores.length;  // 자주 쓰이는 것은 변수로 만들기
		// 랭킹 배열 선언
		int[] ranking = new int[s_len];
		
		// 순차 탐색 (중첩 for문 사용)
		for(int i=0; i<s_len; i++){
			ranking[i] = 1;   // 1등이라고 가정
			
			for(int j=0; j<s_len; j++){
				// 더 높은 숫자 수만큼 등수를 증가시킨다
				if(scores[i]<scores[j])
					ranking[i]++;
			}
		}
		
		System.out.println("총 " + s_len + "명 학생의 성적과 등수는?");
		for(int i=0; i<s_len; i++)
			System.out.printf("%d점 --> %d등  ", scores[i], ranking[i]); System.out.println();
		
		// 점수 오름차순 정렬
		Arrays.sort(scores);
		
		for(int i=0; i<s_len; i++){
			ranking[i] = 1;   // 1등이라고 가정
			
			for(int j=0; j<s_len; j++){
				// 더 높은 숫자 수만큼 등수를 증가시킨다
				if(scores[i]<scores[j])
					ranking[i]++;
			}
		}
	
		for(int i=0; i<s_len; i++)
			System.out.printf("%d점 --> %d등  ", scores[i], ranking[i]); System.out.println();
	}
}