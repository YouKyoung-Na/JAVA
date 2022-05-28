abstract class PairMap{
	protected String keyArray[];  //key 들을 저장하는 배열
	protected String valueArray[];  //value 들을 저장하는 배열
	abstract String get(String key);
	abstract void put(String key, String value);  //key와 value를 쌍으로 저장

	abstract String delete(String key);  //key값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
	abstract int length();  //현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap{  //PairMap 상속받은 Dictionary 클래스 
	public int size;  //담을 수 있은 데이터 크기
	public Dictionary(int num) {  //딕셔너리 클래스
		keyArray = new String[num];
		valueArray = new String[num];
	    this.size = 0;  //필드 변수 size를 0으로 반환함
}

@Override
public String get(String key) {
      for(int i=0; i<keyArray.length; i++) {  //배열의 크기만큼 반복
         if(key.equals(keyArray[i])) {  //key값의 i에 값이 같으면 
            return valueArray[i];  //Value 값 반환
         }
      }
      return null; // 원하는 key가 없다면 null 리턴
   }
   public void put(String key, String value) {  //put 메서드
      for(int i=0; i<keyArray.length; i++) {  //key 배열 만큼 반복
         if(key.equals(keyArray[i])) {
            keyArray[i] = key;
            valueArray[i] = value;
            return; // 중복 key가 있다면 종료
         }
      }
      keyArray[size] = key;
      valueArray[size] = value;
      size++;
   }
   public String delete(String key) {
      for(int i=0; i<keyArray.length; i++) {
         if(key.equals(keyArray[i])) {
            String str = valueArray[i];  //str 변수에는 value값 저장
            keyArray[i] = null;
            valueArray[i] = null;
            return str;  // 삭제된 value 값 리턴
         }
      }
      return null; // 삭제된 것이 없다면 null 리턴
   }
   public int length() {
      return size;
   }
}


public class proj3 {  //DictionaryApp 명칭 proj3으로 바꿈
	public static void main (String[] args){
		Dictionary dic = new Dictionary(10);
		dic.put("“황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
		System.out.println("이재문의 값은 "+ dic.get("이재문")); // 이재문 아이템 출력
		System.out.println("황기태의 값은 "+ dic.get("황기태")); // 황기태 아이템 출력
		dic.delete("황기태"); // 황기태 아이템 삭제
		System.out.println("황기태의 값은 "+ dic.get("황기태")); // 삭제된 아이템 접근
		}
}
