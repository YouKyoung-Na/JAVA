import java.util.Scanner;
public class Dollar {

	public static void main(String[] args) {
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)");   // �Է��϶�� �� ȭ�鿡 ���
			Scanner a = new Scanner(System.in);  //�Էµ� �� ��ĵ
			
			int money = a.nextInt();  //�Է°� money��� ������ ������ ����
			System.out.print(money + "���� ");  //money���� ���� ȭ�鿡 ���
			
			int rate = 1100;  
			float result = money / rate;  //money�� rate�� ����
			
			System.out.println("$" + result +"�Դϴ�.");  //$, result ����, '�Դϴ�' ���
			
	}

}
