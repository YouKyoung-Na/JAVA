package ����3;
import java.util.Scanner;

class Grade{  //grade Ŭ���� ����
	private int math; //private �Ű�������
	private int science;
	private int english;
	
	Grade(int math, int science, int english){  //�����ڿ� �Ű����� 
		this.math = math;  //this�� ��ü ��� ȣ��
		this.science = science;
		this.english= english; 
	}
	public int average(){  //�޼ҵ� ���� Ÿ�� ������
		return(math+science+english)/3;  //average �޼ҵ� ���� ��
	}
}



public class GradeClass {
	public static void main(String[] args) {  //���� �޼ҵ� (������ ���õ�)
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		int math = sc.nextInt();  //scanner���� �Է¹��� �� scan
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);  //Ŭ�������� ������
		System.out.println("����� "+ me.average());  //average �޼ҵ� ������
		
		sc.close();

	}

}
