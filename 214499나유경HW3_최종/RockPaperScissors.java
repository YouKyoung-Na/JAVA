package ����3;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //�Է� ����
		String str[]= {"����", "����", "��"};
		String User;
		String Computer;
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		do {  //do-while �ݺ���
	         System.out.print("���� ���� ��! >> ");
	         User = sc.next();
	        if(User.equals("�׸�"))  //user�� �׸��̶�� �ϸ� ����
	        	 break;
	        int n = (int)(Math.random()*3);  //���� �� 0~2
	         Computer =str[n];   //��ǻ�Ͱ� ���� �� = str[n]�� ��
			
			if(User.equals("����")) {  //user�� ������� ���� ��
	            if(str[n].equals("����")) {  //��ǻ�͵� ������� ���� �� 
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {  //��ǻ�Ͱ� ������� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {  //��ǻ�Ͱ� ����� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	         }
	         else if(User.equals("����")) {  //user�� ������� ���� ��
	            if(str[n].equals("����")) {  //��ǻ�Ͱ� ������� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {  //��ǻ�Ͱ� ������� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {  //��ǻ�Ͱ� ����� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+ " ����ڰ� �����ϴ�.");
	               continue;
	            }
	         }
	         else if(User.equals("��")) {  //user�� ����� ���� ��
	            if(str[n].equals("����")) {  //��ǻ�Ͱ� ������� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {  //��ǻ�Ͱ� ������� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {  //��ǻ�Ͱ� ����� ���� ��
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Computer+" �����ϴ�.");
	               continue;
	            }
	         }
	         System.out.print("����� = "+User+" , ��ǻ�� = "+Computer+" ");
	      }
		  while(true);
	      	System.out.println("������ �����մϴ�...");
	      	sc.close();
	   }

}


