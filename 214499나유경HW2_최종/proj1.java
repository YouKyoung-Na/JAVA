import java.util.Scanner;
public class proj1 {
	public static void main(String[] args) {
		System.out.print("������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
				
		for (int i=1; i<=num; i++) {  //0���� �����ϸ� �� ���ٿ� ���� ���� 
			for(int j=num+1; j>i; j--) {  //j�� i���� Ŭ ���� ���, num+1�� �ؾ� ������ 5���� -1���� ������??
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}	
}
