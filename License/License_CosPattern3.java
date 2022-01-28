// 중첩 반복문 구조에 대해서 구현해보시오
// continue label이란 무엇인지 설명해보고 관련된 예제를 코드로 구현해보시오
/* 이 문제는 생각보다 까다로운 continue 와 continue label 사용에 대해서 아는지를 묻는 문제이다
-------------------------------------------------------------------------------------------------------------------------------
0 2 4 6 8
10 12 14 16 18
20 22 24 26 28
30 32 34 36 38
-------------------------------------------------------------------------------------------------------------------------------*/
public class License_CosPattern3{
	public static void main(String[] args){
		// 나의 풀이
		/*int number = 0;   // 0을 따로 출력해야 함
		System.out.println(number + "  ");
		
		for(int i=0; i<4; i++){
			for(int j=0; j<5; j++){
				if(number%2 != 0){
					number++;
					continue;
				}
				number++;  // 같은 코드 2번 작성
				System.out.print(number + "  ");
			}
		}*/
		
		for(int i=0; i<4; i++){
			for(int j=0; j<10; j++){
				int number = i*10 + j;
				
				if(number%2 != 0)
					continue;
				System.out.print(number + "  ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		// labeled continue 사용
		label:
		for(int i=0; i<4; i++){
			for(int j=0; j<10; j++){
				int number = i*10 + j;
				
				if(j == 0){   // 10 단위만
					System.out.println(number + "  ");
					continue label;
				}
			}
		}
	}
}
