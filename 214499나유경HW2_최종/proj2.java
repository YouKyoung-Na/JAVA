import java.util.Scanner;
public class proj2 {
	public static void main(String[] args) {
		System.out.print("������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();  // num �Է� �޾Ƴ�
		int i;
		int j;
		
		for (i=1; i<=num; i++) {  //0���� �����ϸ� �� ���ٿ� ���� ����
			for(j=0; j<i; j++) {  // j=0���� i-1�� �ε������� ����
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}	
}
