public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;  
		int i =100;
		
		System.out.println(b+i);  //���������� �ڵ� Ÿ�Ժ�ȯ
		System.out.println(10/4);  //int������ �ڵ� Ÿ�� ��ȯ
		System.out.println(10.0/4);  // �Ǽ������� �ڵ� Ÿ�� ��ȯ
		System.out.println((char)0x12340041);  //���������� ���� Ÿ�Ժ�ȯ
		System.out.println((byte)(b+i));  //byte������ ���� Ÿ�� ��ȯ
		System.out.println((int)2.9+1.8);  // int������ ���� Ÿ�� ��ȯ
		System.out.println((int)(2.9+1.8));  // int ������ ���� Ÿ�� ��ȯ
		System.out.println((int)2.9+(int)1.8);	//int ������ ���� Ÿ�� ��ȯ
	}

}