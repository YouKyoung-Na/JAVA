import java.util.Scanner;
public class proj4 {
	public static void main(String[] args) {		
		int random=(int)(Math.random()*50+1);  //���� �� 1~50 ����
		int cnt = 0;  //ī��Ʈ ���� �ʱ�ȭ
		
		Scanner scanner = new Scanner(System.in);
		while(true) {  //���� �ݺ�
			cnt++;  //ī��Ʈ �ݺ� ���� ��
			System.out.print("���ڸ� �����Ͽ� ������.: ");		
			int num = scanner.nextInt();			
			
			if(num<random) {
				System.out.println("UP");
				continue;
			}
			else if(num>random) {
				System.out.println("DOWN");
				continue;
			}
				
			else if(random==num) {  //���� ���� �Է°��� ���� �� ��������
				System.out.println("�����Դϴ�. �õ�Ƚ�� = "+cnt);
				break;
			}
		}
	}

}
