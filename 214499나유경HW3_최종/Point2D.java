package 과제3;
class Point {  //point 클래스
	private int x, y;  //private 정수형 변수 x,y
	public Point(int x, int y) { this.x = x; this.y = y; }  //객체 호출
	public int getX() { return x; }  //객체 가져옴
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {  //point 상속된 colorpoint 클래스 
	private String color;  //문자열 String private로 제한
	public ColorPoint() {  //생성자 호출
		super(0, 0);  //부모 클래스로부터 0,0 입력, black
		color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y);  //부모클래스에서 상속
		color = "BLACK";
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;  //객체 호출
	}
	public void setXY(int x, int y) {  //setXY 메소드
		move(x, y);
	}
	public void setColor(String color) {  //setColor라는 메소드
		this.color = color;
	}
	public String toString() {  //toString이라는 메소드
		return (color+"색의 ("+getX()+","+getY()+")의 점");
	}
}

public class Point2D {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");


	}

}
