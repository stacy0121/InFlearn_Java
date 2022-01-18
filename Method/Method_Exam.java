// 메서드의 정의와 기본적인 자바의 메서드를 작성해보시오
// 이 문제는 자바의 메서드 개념과 메서드가 가지는 여러 특징들에 대해서 알고 있는지를 묻는 문제이다

// main 메서드는 static 메서드만 호출 가능 (생성된 객체가 없을 때)
import java.util.Scanner;

public class Method_Exam {
	public static String capitalMethod(String str){
		String ret = str.toUpperCase();
		return ret;
	}
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자로 입력하시오 : ");
		String rst = sc.next();
		
		System.out.println("입력한 소문자의 대문자는 = " + capitalMethod(rst));   // 함수 호출
	}
}