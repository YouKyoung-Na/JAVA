import java.util.Scanner;  //scanner ��� ���
public class fourth {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� ��� a,b,c�� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�.");  //ȭ�鿡 ���
		
		int a = scanner.nextInt();  //�Է� ���� �� ���ʴ�� ������ ����
		int b= scanner.nextInt();
		int c = scanner.nextInt();
		
		double expression = (b*b)-(4*a*c);  // ���� double��
		double root = Math.sqrt(expression); // expression�� ��Ʈ 
		
		double x1=(-b+root)/(2*a);
		double x2=(-b-root)/(2*a);
		
		System.out.println("������������ ���� " + x1 + "��" + x2 +" �Դϴ�.");
		
		scanner.close();
	}

}