package 과제3;

class TV{  //TV 클래스 생성 
	private String name;  //name 문자열 , private 접근 지정자
	private int year;   //year 정수형, private 접근 지정자
	private int inch;
	
	TV(String name, int year, int inch){  //TV 생성자 지정
		this.name = name;  //this로 객체 멤버 호출
		this.year = year;
		this.inch = inch;
	}
	public void show() {  //show라는 메소드를 public 멤버로 지정
		System.out.println(name+"에서 만든 "+ year + "년형 " + inch+"인치 TV");
	}
}

public class TvClass {  //메인 메소드
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
