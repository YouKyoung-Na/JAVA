import java.util.Scanner;
interface Stack{  //�������� ���õ� �ڵ�
	int length();  //���� ���ÿ� ����� ���� ����
	int capacity();  //������ ��ü ���� ������ ���� ����
	String pop();  //������ �鿡 �Ǽ� ����
	boolean push(String val);  //������ �鿡 ����� �Ǽ� ����
}

class StringStack implements Stack{  //�������̽� ����
	public int num;  //���ÿ� ���� ���� ũ��
	public int index;  //���� �ε���  
	public String[] stack;
	public StringStack(int num) {  //StringStack �޼���
		this.num = num;  //�ʵ� ���� �޾ƿ�
		this.index = index; 
		stack = new String[num];
	}
	public int length() {  //length �޼���, �������̽��� ���õ� �޼��� �ڵ� ����
		return index;  //���� �ε����� ������
	}
	public int capacity() {  //capacity �޼���, ���� ����
		return stack.length;  //������ ���� �ε��� ����
	}
	public String pop() {
		if(index-1<0)  //Stack �� �ƹ��͵� �ȵ����� ��
			return null;
		index--;  //������ �ε������� ������ 
		String str = stack[index];  // ��Ʈ�� ����
		return str;
	}
	public boolean push(String val) {  
		if (index<num) {  //���� �ֻ��� ��(�� �������� ���� ��)�� �ε����� ������ ũ�⺸�� ���� ��
			stack[index]=val;
			index++;  //stack �ֻ��� ���� �ε��� �÷���
			return true;
		}
		else 
			return false;  //������ �� á���� false�� ����
	}
}

public class proj2 {  //StackAppŬ���� ��Ī ��ſ� proj2 �̸� ��
	public static void main(String[] args) {		
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		Scanner sc = new Scanner(System.in);  //��ĵ 
		int num = sc.nextInt();  //��ĵ �� num�� �޾ƿ�
		StringStack stack = new StringStack(num);  
		while(true) {  //���ѹݺ�
			 System.out.print("���ڿ� �Է� >> ");
			 String val = sc.next();
			 if(val.equals("�׸�"))  //�׸��̶�� ���� �ԷµǾ�����
				 break;
			 if(!stack.push(val)) {  //���� Ǫ�ÿ� �������� ��
				 System.out.println("������ ������ Ǫ�� �Ұ�!");
			 }
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");		
		int len = stack.length();  //for������ �ٷ� ���� �Է��ϸ� �Ѱ� ©��
		for(int i=0; i<len; i++) {  //������ ���̸�ŭ �ݺ�, i<=len���� �ϸ� null������ ���
			String str = stack.pop();  //str�������� stack�� �ֻ����� pop
			System.out.print(str+" ");  //�������� ���� ����
		}
	}
}
