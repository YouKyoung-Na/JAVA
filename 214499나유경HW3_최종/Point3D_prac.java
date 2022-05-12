package 과제3;
class Point2 {  //point2 클래스(겹치는 클래스 있어서 point2라 지정)
	private int x, y;
	public Point2(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class Point3D extends Point {  //point 클래스 상속받은 point3d클래스
	private int z;  //정수형 변수 z(3차원 공간) 선언
	public Point3D(int x, int y, int z) {  //생성자 메소드
		super(x, y);  //부모클래스에서 상속받음
		this.z = z;  //생성자 호출
	}
	public int getZ() {  //z 받음
		return z;
	}
	public void moveUp() {  //올라갈 때 z 후위 증가
		z++;
	}
	public void moveDown() {  //내려갈 때 z 후위 감소
		z--;
	}
	public String toString() {
		return ("("+getX()+","+getY()+","+getZ()+")의 점");
	}
	protected void move(int x, int y, int z) { 
		move(x, y);
		this.z = z; 
	}
	
}

public class Point3D_prac {

	public static void main(String args[]) {
		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3은 각각 x, y, z축의 값.
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300); // x, y, z 축으로 이동
		System.out.println(p.toString() + "입니다.");

	}

}
