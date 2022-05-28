import java.util.Scanner;
public class proj4 {
	public static void main(String[] args) {		
		int random=(int)(Math.random()*50+1);  //랜덤 수 1~50 만듬
		int cnt = 0;  //카운트 변수 초기화
		
		Scanner scanner = new Scanner(System.in);
		while(true) {  //무한 반복
			cnt++;  //카운트 반복 마다 셈
			System.out.print("숫자를 추측하여 보세요.: ");		
			int num = scanner.nextInt();			
			
			if(num<random) {
				System.out.println("UP");
				continue;
			}
			else if(num>random) {
				System.out.println("DOWN");
				continue;
			}
				
			else if(random==num) {  //랜덤 수와 입력값이 같을 때 빠져나감
				System.out.println("정답입니다. 시도횟수 = "+cnt);
				break;
			}
		}
	}

}
