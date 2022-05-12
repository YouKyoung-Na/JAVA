package ����3;
import java.util.Scanner;

class Dictionary{  //��ųʸ� Ŭ����
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };  //kor �迭
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {  //�˻� �ڵ�
		for(int i=0; i<kor.length; i++) {  //kor�� �迭�� ���̸�ŭ �ݺ�
			if(word.equals(kor[i])) {  //�Է� ���� kor�� �迭 �� �ϳ��� ������ ���� �ε��� ���� eng�迭 ���
				return eng[i];
			}
		}
		return "false";
	}
}
public class DicApp {
	Scanner sc = new Scanner(System.in);
	String word;
	
	public void Run() {  //���θ޼ҵ忡 ���� Ŭ���� �ۼ� 
		while(true) {  //���� ����
			System.out.print("�ѱ� �ܾ�? ");
			word = sc.next();
			if(word.equals("�׸�")) {  //word �׸��̶�� �Էµ��� �� ���� Ż��
				break;
			}
			String result = Dictionary.kor2Eng(word);  //dictionaryŬ������ kor2Eng �Լ� Ȱ��
			if(result=="false")  //���� false���
				System.out.println(word+"��(��) ���� ������ �����ϴ�.");
			else
				System.out.println(word+"��(��) "+result);  //���� ������ ��� ��ȯ
		}
	}

	public static void main(String[] args) {  //���� �޼ҵ�
		DicApp dicapp = new DicApp();  //������ ȣ��
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		dicapp.Run();

	}

}
