import java.util.Scanner;
 public class hw2 {
	public static void main(String[] args) {
		System.out.print("���� ������ �Է��Ͻÿ�.: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=2; i<=num; i++) {  //�Ҽ��� 2���� �����ϹǷ� 2~num���� �ݺ�
			boolean isPrime = true;  //boolean���� true(1)����
			
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) {  //�������Ƿ� �Ҽ��� �ƴ� boolean���� false����
					isPrime = false;  
					break;  //��������
				}
			}
			if(isPrime) {  //boolean���� true�� �� 
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
  }