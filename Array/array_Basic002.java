// 배열 요소에 데이터 값을 넣으려면 어떻게 해야하는지 작성해보시오
// 이 문제는 배열을 생성한 후에 데이터 값을 입력하는 방법에 대해서 아는지를 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
3
11
22
33
44
44
-----------------------------------------------------------------------------------------------------------------------------*/

public class array_Basic002{
	public static void main(String[] args){
		int[] array = new int[5];
		
		// 데이터 값 입력
		array[0] = 3;
		array[1] = 11;
		array[2] = 22;
		array[3] = 33;
		array[4] = 44;
		
		// 결과 출력
		for(int i=0; i < 5; i++){
			System.out.println(array[i]);
		}
		System.out.println(array[4]);
	}
}