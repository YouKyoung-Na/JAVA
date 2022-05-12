package 과제3;
import java.util.Scanner;

class Dictionary{  //딕셔너리 클래스
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };  //kor 배열
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {  //검색 코드
		for(int i=0; i<kor.length; i++) {  //kor아 배열의 길이만큼 반복
			if(word.equals(kor[i])) {  //입력 값이 kor의 배열 중 하나와 같으면 같은 인덱스 값인 eng배열 출력
				return eng[i];
			}
		}
		return "false";
	}
}
public class DicApp {
	Scanner sc = new Scanner(System.in);
	String word;
	
	public void Run() {  //메인메소드에 실행 클래스 작성 
		while(true) {  //무한 루프
			System.out.print("한글 단어? ");
			word = sc.next();
			if(word.equals("그만")) {  //word 그만이라고 입력됐을 때 루프 탈출
				break;
			}
			String result = Dictionary.kor2Eng(word);  //dictionary클래스의 kor2Eng 함수 활용
			if(result=="false")  //값이 false라면
				System.out.println(word+"은(는) 저의 사전에 없습니다.");
			else
				System.out.println(word+"은(는) "+result);  //값이 있으면 결과 반환
		}
	}

	public static void main(String[] args) {  //메인 메소드
		DicApp dicapp = new DicApp();  //생성자 호출
		System.out.println("한영 단어 검색 프로그램입니다.");
		dicapp.Run();

	}

}
