package 과제3;

class TV2{  //같은 패기지 내에 tv가 있으므로 tv2라고 지정
	private int size;  // 정수형 매개변수 size
	public TV2(int size) {this.size=size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV2{  //tv2를 상속받은 colortv 클래스
	private int result;  //매개변수 result
	
	ColorTV(int size, int result){  //생성자와 매개변수
	super(size);  //부모클래스의 size
	this.result = result;
	}
	
	public void printProperty(){  //printProperty 메소드
	System.out.print(getSize()+"인치 "+ result +"컬러");
	}
}

public class TVInheritance {  //메인 메소드
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();	
	}
}