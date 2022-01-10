// switch 조건문의 사용법을 예제로 설명해보시오
// 사용자가 자신의 연령대를 입력하면 해당 연령대에 맞는 책을 추천하는 코드를 만들어보시오.
// 이 문제는 자바의 switch 조건문을 사용할 수 있는지에 대해서 묻는 문제이다.
/*[소스코드]
----------------------------------------------------------------------
// 변수 조건은 정수형이어야 한다. -> byte, short, int -> 그러나 long 타입은 X, char 타입은 0
// break, default 빼먹지 않도록 주의
switch(age){
	case 10:
		System.out.println(age+"대입니다. 참고서 코너는 A구역입니다.");
		break;
	case 20:
		...
}
----------------------------------------------------------------------*/
import java.util.Scanner;

public class switch_Basic001{
	public static void main(String[] args){
		// [1] 사용자 입력 및 변수 선언
		Scanner input = new Scanner(System.in);
		System.out.print("연령대를 입력해주세요: ");
		int age = input.nextInt();
		
		// [2] 사용자 입력 예외처리
		if(age>10 && age<20){   // 11~19 (연령대 숫자가 아닐 때 방법1)
			System.out.println("10으로 연령대를 다시 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else if(age>20 && age<30){   // (방법2)
			age = 20;
			// System.out.println("20으로 연령대를 다시 입력해주세요. 프로그램을 종료합니다.");
			// System.exit(0);
		}
		else if(age>30 && age<40){
			System.out.println("30으로 연령대를 다시 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else if(age>40 && age<50){
			System.out.println("40으로 연령대를 다시 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else if(age>50 && age<60){
			System.out.println("50으로 연령대를 다시 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else
			if(age<10){
				System.out.println("최소 10 이상 입력해주세요. 프로그램을 종료합니다.");
				System.exit(0);
			}
		
		// [3] switch 조건문
		switch(age){   // 매개변수에 String 타입도 들어갈 수 있음
			case 10:
				System.out.println(age+"대입니다. 참고서 코너는 A구역입니다.");
				break;
			case 20:
				System.out.println(age+"대입니다. 취업서적 코너는 B구역입니다.");
				break;
			case 30:
				System.out.println(age+"대입니다. 자기계발 코너는 C구역입니다.");
				break;
			case 40:
			case 50:
				System.out.println(age+"대입니다. 재테크 코너는 D구역입니다.");
				break;
			default:  // 연령대로 입력하지 않았을 경우 포함
				System.out.println("60대 이상입니다. 건강/장수 코너는 E구역입니다.");
				break;
		}
	}
}
