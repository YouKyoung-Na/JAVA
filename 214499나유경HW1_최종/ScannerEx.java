import java.util.Scanner;  //��� ���

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");  //ȭ�� ���
			Scanner scanner = new Scanner(System.in); //�Է� �� ��ĵ(�������� �и��Ͽ�)
			
			String name = scanner.next();  //1�� �� name�� ����
			System.out.print("�̸��� " + name + ", ");
			
			String city = scanner.next();  //2�� �� city�� ����
			System.out.print("���ô� " + city + ", "); 
			
			int age = scanner.nextInt();  //3�� �� age�� ����
			System.out.print("���̴� " + age + "��, ");  
			
			double weight = scanner.nextDouble();  //4�� �� weight�� ����
			System.out.print("ü���� " + weight + "kg, ");
			
			boolean single = scanner.nextBoolean();  //5�� �� single �� ����
			System.out.print("���� ���δ� " + single + "�Դϴ�.");
			
			scanner.close();
	}

}
