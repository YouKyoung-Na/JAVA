package ����3;

public class Average {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<args.length; i++) {  //args�� �Ű�����, �Ű������� ���̸�ŭ �ݺ�
			sum += Integer.parseInt(args[i]);  //���ڿ��� ������ ��ȯ, ��ü�� ���� ����
		}
		System.out.printf("%d", sum/args.length);  //���� ���� �Ű������� ���̷� ����� ��ձ���
	}

}
