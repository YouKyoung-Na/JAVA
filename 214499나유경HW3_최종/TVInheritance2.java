package 과제3;

class TV3{  //같은 패기지 내에 tv,tv2가 있으므로 tv3라고 지정
	private int size;  // 정수형 매개변수 size
	public TV3(int size) {this.size=size;}
	protected int getSize() {return size;}  //protected의 접근성을 지님
}

class ColorTV2 extends TV3{  //tv3를 상속받은 colortv2 클래스
	private int result;  //매개변수 result
	
	ColorTV2(int size, int result){  //생성자와 매개변수
	super(size);  //부모클래스의 size
	this.result = result;
	}
	
	public void printProperty(){  //printProperty 메소드
	System.out.print(getSize()+"인치 "+ result +"컬러");
	}
}

class IPTV extends ColorTV2 {  //ColorTV2를 상속받은 IPTV
	private String IP;
	public IPTV(String IP, int size, int color) {  //IPTV 생성자와 매개변수
		super(size, color);  //부모클래스의 size와 color 가져옴
		this.IP = IP;  //매개변수 호출
	}
	protected String getIP() { return IP; }
	public void printProperty() {
		System.out.print("나의 IPTV는 "+getIP()+" 주소의 ");  //출력값
		super.printProperty();  //부모클래스의 printproperty도 가져옴
	}
}

public class TVInheritance2 {
	public static void main(String args[]) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048 컬러
		iptv.printProperty();
	}

}
