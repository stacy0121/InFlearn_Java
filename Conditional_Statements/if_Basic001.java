// if ~ else 조건문의 사용법을 예제로 설명해보시오
// 이 문제는 자바의 if ~ else 조건문을 사용할 수 있는지 에 대해서 묻는 문제이다

public class if_Basic001{
	
	public static void main(String[] args){
		// [1] 변수 선언
		int kor=80, eng=90, math=100;
		
		if(eng>=90){
			System.out.println("A 학점입니다.");   // 중괄호 없으면 한 줄만 포함
			System.out.println("축하해요~");
		}
		else
			System.out.println("90점 미만이네요");
	}
}
