//문제에 제시된 코드
class Point{  //point 클래스
	private int x,y;
	public Point(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}	
}

class PositivePoint extends Point{  //point클래스를 상속받은 PositivePoint 클래스
	
	@Override  //오버라이드 확인
	protected void move(int x, int y) {  //move 메소드	
		if(x>0 && y>0) {
			super.move(x, y);  //부모클래스의 x, y 가져옴
		}		
	}
	public PositivePoint() {  //PositivePoint 메서드
		super(0,0);  //부모클래스의 x,y를 0,0으로 가져옴(오버라이딩)
	}
	public PositivePoint(int x, int y) {  
		super(x, y);  //부모클래스의 x,y를 그대로 가져옴-정적바인딩
		if(x<=0 || y <= 0) {  //x, y가 음수라면
			super.move(0, 0);  //x,y 값을 0으로 반환함
		}		
	}
	public String toString() {  //toString 메서드, 자바에는 따로 String이 없음
		String result = "("+getX()+","+getY()+")의 점";
		return result;
	}
	
}

public class proj1 {  //문제 제시된 메인 메소드
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();  //생성자PositivePoint에 객체p 생성
		p.move(10,10);  //동적바인딩 되어 10,10 반환됨
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5,5);  //객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);  //-10은 음수이므로 0으로 반환됨
		System.out.println(p2.toString()+"입니다.");
	}
}
