import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");  
		
		double o_x = scanner1.nextDouble();  //�Է� ���� �� ���ʴ�� ������ ����, ���� �߽� x��ǥ
		double o_y = scanner1.nextDouble();  //���� �߽� y��ǥ
		double r= scanner1.nextDouble(); //���� ������
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("�� �Է�>>");  
		
		double a_x = scanner1.nextDouble();  //�� x��ǥ
		double a_y = scanner1.nextDouble();  //�� y��ǥ
		
		double distance = Math.sqrt((a_x-o_x)*(a_x-o_x)+(a_y-o_y)*(a_y-o_y));  //���� �߽ɰ� ������ �Ÿ�
		
		if(distance<=r) //���� �߽ɰ� �� ������ �Ÿ��� ���������� �۰ų� ������
			System.out.println("�� ("+a_x+","+ a_y+")�� ���� ���ο� �ֽ��ϴ�.");
		else
			System.out.println("�� ("+a_x+","+ a_y+")�� ���� ���ο� �����ϴ�.");
		
		scanner1.close();
		scanner2.close();
		
	}	
}
