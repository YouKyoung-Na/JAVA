import java.util.Scanner;
public class proj3 {

	public static void main(String[] args) {
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		char c=s.charAt(0); //���ڿ��� ù��° ����
		
		if(c<'a'||c>'z') {  //���ڰ� a���� �۰ų� z���� ū ���(�ҹ��ڰ� �ƴ� ���)
			System.out.println("�ҹ��ڰ� �ƴմϴ�.");			
		}
		
		else {
			for(int i=c; i>='a'; i--) { //i�� c�� ���� ������ a���� ũ�ų� ���� ������ �ϳ��� ���� �پ��
				for (char j = 'a'; j<=i; j++) { 
					System.out.print(j);
				}
				System.out.println();
			}
		}
		scanner.close();
	}

}
