import java.util.Scanner;
public class game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		
		int num = scanner.nextInt();
		int ten = num / 10; //num������ 10�� �ڸ� ����
		int first = num % 10; //num������ 1�� �ڸ� ����
		
		if (num<10 && num >=1) {  //���ڰ� ���ڸ� ���� ���
			if (num==3||num==6||num==9)
				System.out.println("�ڼ�¦");
			else
				System.out.println("�Ѿ");
		}
		
		
		else if (num>=10 && num<=99) {  //���ڰ� ���ڸ� ���� ���
			if(ten == first) {  //���� �ڸ� ���� ���� �ڸ� ���� ���� ���
				if(ten== 3||ten==6||ten==9) 
					System.out.println("�ڼ�¦¦");
				else
					System.out.println("�Ѿ");
			}
			else if(ten==3||ten==6||ten==9)  //���� �ڸ� ���ڰ� 3,6,9�� ���
				System.out.println("�ڼ�¦");
			
			else if(first==3||first==6||first==9) //���� �ڸ� ���ڰ� 3,6,9�� ���
				System.out.println("�ڼ�¦");
			else
				System.out.println("�Ѿ");
		}
		else
			System.out.print("1~99������ ������ �Է��Ͻÿ�.");
		
		scanner.close();

	}

}
