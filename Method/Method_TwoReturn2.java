// 반환값이 2 개 있는 메서드를 구현해보시오
// 메서드는 ( korea ", "USA" ) 입력시 소문자는 대문자로 대문자는 소문자로 출력 되도록 구현한다
// 이 문제는 자바의 메서드 작성시 리턴되는 반환값이 2 개일 때 처리하는 방법을 아는지 에 대해서 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
KOREA
usa
-------------------------------------------------------------------------------------------------------------------------------*/
public class Method_TwoReturn2{
	public static String[] capitalMethod(String str1, String str2){
		String str1_ = str1.toUpperCase();
		String str2_ = str2.toLowerCase();
		return new String[] {str1_, str2_};
	}
	public static void main(String[] args){
		// Scanner sc = new Scanner(System.in);   직접 입력받으려면?
		String[] result = capitalMethod("korea", "USA");   // result가 반환된 배열의 주소를 가리킴
		System.out.println(result[0] + " - " + result[1]);
	}
}