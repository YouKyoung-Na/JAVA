import java.util.Scanner;
public class first {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>> ");  //ȭ�鿡 ���
		
		int num = scanner.nextInt();  //�Էµ� ���� int������ ��ĵ
		int one = num%10;  //num�� 10���� ���� ������ ���� ���� �ڸ�
		int ten = num/10;  //num�� 10���� ���� ���� ���� �ڸ�
		
		if(num>=10&&num<=99) {  //10�̻��̰ų� 99������ ��츦 ����(���ڸ���)
			if(ten==one)  //�����ڸ��� ���� �ڸ��� ���ٸ�
				System.out.println("Yes! 10���ڸ��� 1���ڸ��� �����ϴ�.");
			
			else  //���� �ڸ��� ���� �ڸ��� �ٸ��ٸ�
				System.out.println("No! 10���ڸ��� 1���ڸ��� �ٸ��ϴ�.");				
		}
		
		else {  //���ڸ����� �ƴ� ���
			System.out.println("2�ڸ����� ������ �Է����ּ���.");
		}
			
		scanner.close();
	}
}
