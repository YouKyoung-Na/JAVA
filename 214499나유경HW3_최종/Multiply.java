package ����3;
import java.util.Scanner;
import java.util.InputMismatchException;  //�Է� ����ó�� ��Ű��
public class Multiply {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //scanner ���
				
		while(true) {  //���� ���� 
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>> ");
			try {  //try-catch��, ���ܰ� �߻��� ���ɼ��� �ִ� ���๮
				int n = sc.nextInt();  //������ �Է¹޾Ƽ� ��ĵ
				int m = sc.nextInt();
				System.out.print(n+"x"+ m +"="+ n*m);
				break;
			}
			catch(InputMismatchException e) {  //���� ó����, ��ü e�� ���� ������ �Ѿ��
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");  //���� ó���� ��Ÿ���� ����
				sc.nextLine();  //���� ���� �о��
			}
			
		}
				
		sc.close();

	}

}
