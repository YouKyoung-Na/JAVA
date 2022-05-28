import java.util.Scanner;
public class proj1 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
				
		for (int i=1; i<=num; i++) {  //0부터 실행하면 맨 윗줄에 공백 생김 
			for(int j=num+1; j>i; j--) {  //j가 i보다 클 때만 출력, num+1을 해야 변수가 5에서 -1까지 떨어짐??
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}	
}
