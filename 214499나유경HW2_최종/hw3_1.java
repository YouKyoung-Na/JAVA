import java.util.Scanner;
public class hw3_1 {
	public static void main(String[] args) {
				
		System.out.print("ù��° ������ �Է��ϼ���: ");  //���� �Է¹���
		Scanner scanner1 = new Scanner(System.in);
		int n1 = scanner1.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ���: ");
		Scanner scanner2 = new Scanner(System.in);
		int n2 = scanner2.nextInt();
		
		System.out.print("ù��° ������ �Է��ϼ���: ");
		Scanner scanner3 = new Scanner(System.in);
		int n3 = scanner3.nextInt();
		
		int maxNum = 0;  //�ְ� �� ���� �ʱ�ȭ
		
		if(n1>n2 && n1>n3) {  //if������ ���� ��
			maxNum = n1;
		}
		else if(n2>n1 && n2>n3) {
			maxNum = n2;
		}
		else if(n3>n2 && n3>n1) {
			maxNum = n3;
		}
		System.out.println("Max ���� "+maxNum+"�Դϴ�.");

		
		scanner1.close();
		scanner2.close();
		scanner3.close();
	}

}
