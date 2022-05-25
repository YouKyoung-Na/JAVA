class Point{
	private int x,y;
	public Point(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}	
}

class PositivePoint extends Point{
	@Override
	protected void move(int x, int y) {		
		if(x>0 && y>0) {
			super.move(x, y);
		}		
	}
	public void PositivePoint(int x, int y) {
		super.move(x, y);
		if(x<=0 || y <= 0) {
			super.move(0, 0);
		}		
	}
	
}

public class proj1 {
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.move(-5,5);  //��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString()+"�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"�Դϴ�.");
	}
}
