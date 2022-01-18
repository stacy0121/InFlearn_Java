// 사용자 입력을 받아 2 차원 배열을 생성하고 값을 입력하는 코드를 구현하시오
// 이때 , 중첩 반복문을 사용하여 출력 도 같이 해보시오
// 이 문제는 배열 생성시 사용자로 부터 입력을 받아서 2 차원 배열을 만들 수 있는지 를 묻는 문제이다
/*[결과 출력]
-----------------------------------------------------------------------------------------------------------------------------
행의 개수를 입력하고 [Enter] 치세요 = 3
열의 개수를 입력하고 [Enter] 치세요 = 3
1번째 행에 입력할 문자 3 개를 차례대로 입력하고 [Enter] 치세요 = ※＠★
2번째 행에 입력할 문자 3 개를 차례대로 입력하고 [Enter] 치세요 = ○★※
3번째 행에 입력할 문자 3 개를 차례대로 입력하고 [Enter] 치세요 = ＠○ ♨
------------------------------
※＠★
○★※
＠○♨
------------------------------*/
import java.util.Scanner;

public class TwoArray_UserInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 개수를 입력하고 [Enter] 치세요 = ");
		int r = sc.nextInt();
		System.out.print("열의 개수를 입력하고 [Enter] 치세요 = ");
		int  c  = sc.nextInt();
		
		// 사용자 입력 받은 String을 배열로 저장
		String[] strAr = new String[r];   // r번 입력 받음
		
		// 중첩 반복문으로 gameMap에 2차원으로 저장
		char[][] gameMap = new char[r][c];
		
		for(int i=0; i<r; i++){
			System.out.print((i+1) + "번째 행에 입력할 문자 " + c + "개를 차례대로 입력하고 [Enter] 치세요 = ");
			strAr[i] = sc.next();   // 배열에 넣기
			for(int j=0; j<c; j++)
				gameMap[i][j] = strAr[i].charAt(j);
		}
		
		// 2차원 배열 값 출력
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++)
				System.out.print(gameMap[i][j]);
		System.out.println();
		}
	}
}