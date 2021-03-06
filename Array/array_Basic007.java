// 배열을 복사하는 메서드를 말해보고 관련된 예제 코드를 구현해보시오
// 이 문제는 배열 복사시 사용하는 메서드명과 사용법에 대해서 알고 있는지를 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 3, 4, 5, 8, 9, 10]
-----------------------------------------------------------------------------------------------------------------------------*/
import java.util.Arrays;

public class array_Basic007{
	public static void main(String[] args){
		int[] ar = {1, 2, 3, 4, 5};
		int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   // 타겟 배열 필요
		System.arraycopy(ar, 2, ar2, 4, 3);
		System.out.println(Arrays.toString(ar2));   // 배열의 형태로 출력
	}
}