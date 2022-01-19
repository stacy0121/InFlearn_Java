// 2개의 정수형 값을 리턴하는 메서드를 구현하시오
// 이 문제는 두개의 리턴 값을 반환하는 메서드 작성법을 아는지 에 대해서 묻는 문제이다
import java.util.Arrays;

public class Method_TwoReturn{
	// 리턴할 2개의 값을 배열에 저장하여 한 번에 반환
	public static int[] testMethod(){
		int num1=100;
		int num2=200;
		return new int[] {num1, num2};
	}
		
	public static void main(String[] args){
		int[] result = testMethod();   // 반환값이 배열. result가 가리킴
		 System.out.println(Arrays.toString(result));   // 여기서 함수 호출해도 됨
	}
}