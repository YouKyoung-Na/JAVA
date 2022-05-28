abstract class PairMap{
	protected String keyArray[];  //key ���� �����ϴ� �迭
	protected String valueArray[];  //value ���� �����ϴ� �迭
	abstract String get(String key);
	abstract void put(String key, String value);  //key�� value�� ������ ����

	abstract String delete(String key);  //key���� ���� ������(value�� �Բ�) ����. ������ value �� ����
	abstract int length();  //���� ����� �������� ���� ����
}

class Dictionary extends PairMap{  //PairMap ��ӹ��� Dictionary Ŭ���� 
	public int size;  //���� �� ���� ������ ũ��
	public Dictionary(int num) {  //��ųʸ� Ŭ����
		keyArray = new String[num];
		valueArray = new String[num];
	    this.size = 0;  //�ʵ� ���� size�� 0���� ��ȯ��
}

@Override
public String get(String key) {
      for(int i=0; i<keyArray.length; i++) {  //�迭�� ũ�⸸ŭ �ݺ�
         if(key.equals(keyArray[i])) {  //key���� i�� ���� ������ 
            return valueArray[i];  //Value �� ��ȯ
         }
      }
      return null; // ���ϴ� key�� ���ٸ� null ����
   }
   public void put(String key, String value) {  //put �޼���
      for(int i=0; i<keyArray.length; i++) {  //key �迭 ��ŭ �ݺ�
         if(key.equals(keyArray[i])) {
            keyArray[i] = key;
            valueArray[i] = value;
            return; // �ߺ� key�� �ִٸ� ����
         }
      }
      keyArray[size] = key;
      valueArray[size] = value;
      size++;
   }
   public String delete(String key) {
      for(int i=0; i<keyArray.length; i++) {
         if(key.equals(keyArray[i])) {
            String str = valueArray[i];  //str �������� value�� ����
            keyArray[i] = null;
            valueArray[i] = null;
            return str;  // ������ value �� ����
         }
      }
      return null; // ������ ���� ���ٸ� null ����
   }
   public int length() {
      return size;
   }
}


public class proj3 {  //DictionaryApp ��Ī proj3���� �ٲ�
	public static void main (String[] args){
		Dictionary dic = new Dictionary(10);
		dic.put("��Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
		System.out.println("���繮�� ���� "+ dic.get("���繮")); // ���繮 ������ ���
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����")); // Ȳ���� ������ ���
		dic.delete("Ȳ����"); // Ȳ���� ������ ����
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����")); // ������ ������ ����
		}
}
