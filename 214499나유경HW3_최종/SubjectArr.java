package ����3;
import java.util.Scanner;

public class SubjectArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //�Է� ����
		String course []= {"Java", "c++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score []= {95,88,76,62,55};  //���� �迭
		String name="";  // name�� ���ڿ� �ʱ�ȭ
		int count = 0;   //count �� 0���� �ʱ�ȭ
		
		while(true) {  //���ѷ���
			System.out.print("���� �̸�>> ");
			name = sc.next();
			if(name.equals("�׸�"))  
				break;  //�׸��� �Է¹����� ���ѷ��� Ż��
			
			for(int i=0; i<course.length; i++) {  //course�� ���� ��ŭ �ݺ�
				if(course[i].equals(name)) {  //������� course[i]�� ���ڿ��� ���� ���
					System.out.println(course[i]+"�� ������ "+score[i]);  
					  //course�� �ε����� ������ score ���� ���
					count++;  //��ġ�ϴ� ������ ���� ������ count�� �÷���
				}
			}
			if(count == 0)  //count�� 0 == ��ġ�ϴ� ������ ����
				System.out.println("���� �����Դϴ�.");
		}
		sc.close();
	}

}
