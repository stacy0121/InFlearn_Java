// 중첩된 if 조건문을 사용하는 예제를 만들어보시오
// 아래의 코드는 { } 괄호가 없이 중첩되서 if ~ else 조건문을 쓰고 있는데 틀린 곳이 있는지 말해보시오
// 이 문제는 if 조건문을 중첩하여 사용하는 방법에 대해서 알고 있는지를 묻는 문제이다
/* [소스코드]
---------------------------------------------------------------------------------
… (생략)
else
	if(total_score >= 180)
		System.out.println("매우 노력하세요 . 재수강 대상자는 아닙니다 .");
	else
		System.out.println("매우 노력하세요 . 재수강 대상자입니다 .");
---------------------------------------------------------------------------------*/
public class if_Basic002{
	public static void main(String[] args){
		// [1] 변수 선언하기
		int kor=40, eng=70, math=30;
		int total_score=kor+eng+math;
		
		// [2] if~else if~else 조건문 사용하기
		if(total_score>=270){
			System.out.println("당신의 총 점수는 "+total_score+"입니다. 매우매우 잘했어요~");
			System.out.println("축하해요~");
		}
		else if(total_score>=240){
			System.out.println("당신의 총 점수는 "+total_score+"입니다. 잘했어요~");
		}
		else if(total_score>=210){
			System.out.println("당신의 총 점수는 "+total_score+"입니다. 노력하세요~");
		}
		else  // 중괄호가 빠져도 중첩된 if-else문이 제대로 동작한다.
			if(total_score >= 180) 
				System.out.println("매우 노력하세요 . 재수강 대상자는 아닙니다 .");
			else
				System.out.println("매우 노력하세요 . 재수강 대상자입니다 .");
	}
}