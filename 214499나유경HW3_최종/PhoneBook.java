package 과제3;
import java.util.Scanner;

class Phone{  //Phone class 작성
	private String name;  //Phone의 private 매개변수들
	private String tel;
	
	public Phone(String name, String tel) {  //생성자와 매개변수들
		this.name = name;  //this로 객체 호출
		this.tel = tel;		
	}
	public String getName() {  //get으로 변수값 반환 return 반드시 필요함
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class PhoneBook {
	public static void main(String[] args) {  //메인 메소드
		Scanner sc = new Scanner(System.in);
		Phone phone[];  //phone 배열 생성
		int i;
		
		System.out.print("인원수>> ");
		int num = sc.nextInt();  //인원수 받아옴
		phone = new Phone[num];
		for(i=0; i<phone.length;i++) {  //반복문으로 인원수많큼 반복함
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력>>> ");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);  //phone 클래스에서 가져옴
		}
		System.out.println("저장되었습니다...");
		while(true) {  //무한 반복
			System.out.print("검색할 이름>> ");
			String name = sc.next();
			for(i=0; i<num;i++) {  //인원수만큼 반복
				if(name.equals(phone[i].getName())) {  //phone배열의 이름과 같으면 출력
					System.out.println(name+"의 번호는 "+phone[i].getTel()+"입니다.");
					i--;
					break;
				}
			}
			if(name.equals("그만"))  //그만이 입력되면 무한 루프 탈출
				break;
			if(i==num)
				System.out.println(name+"이 없습니다.");
		}
		sc.close();
	}

}
