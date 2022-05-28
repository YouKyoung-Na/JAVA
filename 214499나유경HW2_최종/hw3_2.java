import java.util.Scanner;
public class hw3_2 {
	public static void main(String[] args) {
				
		System.out.print("첫번째 정수를 입력하세요: ");  //숫자 입력받음
		Scanner scanner1 = new Scanner(System.in);
		int n1 = scanner1.nextInt();
		
		System.out.print("두번째 정수를 입력하세요: ");
		Scanner scanner2 = new Scanner(System.in);
		int n2 = scanner2.nextInt();
		
		System.out.print("첫번째 정수를 입력하세요: ");
		Scanner scanner3 = new Scanner(System.in);
		int n3 = scanner3.nextInt();
		
		int minNum = 0;  //최소 수 변수 초기화
		
		if(n2>n1 && n3>n1) {  //if문으로 숫자 비교
			minNum = n1;
		}
		else if(n1>n2 && n3>n2) {
			minNum = n2;
		}
		else if(n2>n3 && n1>n3) {
			minNum = n3;
		}
		System.out.println("Min 값은 "+minNum+"입니다.");

		
		scanner1.close();
		scanner2.close();
		scanner3.close();
	}

}
