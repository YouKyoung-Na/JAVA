import java.util.Scanner;
public class proj2 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();  // num 입력 받아냄
		int i;
		int j;
		
		for (i=1; i<=num; i++) {  //0부터 실행하면 맨 윗줄에 공백 생김
			for(j=0; j<i; j++) {  // j=0부터 i-1의 인덱스까지 증감
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}	
}
