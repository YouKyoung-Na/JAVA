package ����3;
import java.util.Scanner;

class Phone{  //Phone class �ۼ�
	private String name;  //Phone�� private �Ű�������
	private String tel;
	
	public Phone(String name, String tel) {  //�����ڿ� �Ű�������
		this.name = name;  //this�� ��ü ȣ��
		this.tel = tel;		
	}
	public String getName() {  //get���� ������ ��ȯ return �ݵ�� �ʿ���
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class PhoneBook {
	public static void main(String[] args) {  //���� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		Phone phone[];  //phone �迭 ����
		int i;
		
		System.out.print("�ο���>> ");
		int num = sc.nextInt();  //�ο��� �޾ƿ�
		phone = new Phone[num];
		for(i=0; i<phone.length;i++) {  //�ݺ������� �ο�����ŭ �ݺ���
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�>>> ");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);  //phone Ŭ�������� ������
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {  //���� �ݺ�
			System.out.print("�˻��� �̸�>> ");
			String name = sc.next();
			for(i=0; i<num;i++) {  //�ο�����ŭ �ݺ�
				if(name.equals(phone[i].getName())) {  //phone�迭�� �̸��� ������ ���
					System.out.println(name+"�� ��ȣ�� "+phone[i].getTel()+"�Դϴ�.");
					i--;
					break;
				}
			}
			if(name.equals("�׸�"))  //�׸��� �ԷµǸ� ���� ���� Ż��
				break;
			if(i==num)
				System.out.println(name+"�� �����ϴ�.");
		}
		sc.close();
	}

}
