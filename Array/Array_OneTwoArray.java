// 1, 2 차원 배열의 생성 및 출력을 다양한 예제로 구현해보시오
// 이 문제는 자바 배열에 관해서 2 차원 배열 위주로 생성 및 출력을 다양하게 해보는 종합문제 입니다
public class Array_OneTwoArray{
	public static void main(String[] args){
		// 객체 배열
		String[] province = new String[3];   // null로 초기화
		
		// 배열 초기화 (방법 2가지)
		province[0] = "강원도";
		province[1] = "전라도";
		province[2] = "경상도";
		
		String[] nation = new String[] {"한국", "미국", "중국"};
		String[] flower = {"무궁화", "해바라기", "개나리"};
		
		// 반복문으로 flower 배열의 원소 출력 (for문, for-each문)
		for(int i = 0; i<flower.length; i++)
			System.out.print(flower[i]  + " ");
		System.out.println();
		
		for(String aaa:flower)
			System.out.print(aaa+" ");
		System.out.println();
		
		// 아시아(동북아시아, 동남아시아) 2차원 배열 (2x3)
		String[][] asiaNations = {
			{"한국", "중국", "일본"},
			{"태국", "베트남", "필리핀"}
		};
		
		System.out.println(asiaNations[0]);   // 주소값 출력
		System.out.println(asiaNations[0][1]);
		System.out.println(asiaNations.length);   // 2
		
		// for문으로 2차원 배열 출력 -> 중첩 for문
		for(int i=0; i<asiaNations.length; i++){
			for(int j=0; j<asiaNations[i].length; j++)
				System.out.print(asiaNations[i][j]+"");
			System.out.println();
		}
			
		// charAt() 메서드 : 인덱스에 해당하는 값 반환 -> 배열에 한 글자씩 저장하는 데 사용
		String[] strAr = {"hong", "kim", "park"};
		System.out.println(strAr[0].charAt(2));   // n
		System.out.println(strAr[1].charAt(2));  // m
		
		// charAt()와 올바른 for문을 사용한 배열 원소 출력(length vs length())
		for(int i=0; i<strAr.length; i++)
			for(int j=0; j<strAr[i].length(); j++)   // 괄호가 있으면 문자열 길이 세기
				System.out.print(strAr[i].charAt(j));
			System.out.println();
				
	}
}