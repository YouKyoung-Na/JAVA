import java.util.Scanner;
 public class hw2 {
	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하시오.: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=2; i<=num; i++) {  //소수는 2부터 시작하므로 2~num까지 반복
			boolean isPrime = true;  //boolean형에 true(1)저장
			
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) {  //나눠지므로 소수가 아님 boolean형에 false저장
					isPrime = false;  
					break;  //빠져나감
				}
			}
			if(isPrime) {  //boolean형이 true일 때 
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
  }