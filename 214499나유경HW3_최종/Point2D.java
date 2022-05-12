package ����3;
class Point {  //point Ŭ����
	private int x, y;  //private ������ ���� x,y
	public Point(int x, int y) { this.x = x; this.y = y; }  //��ü ȣ��
	public int getX() { return x; }  //��ü ������
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {  //point ��ӵ� colorpoint Ŭ���� 
	private String color;  //���ڿ� String private�� ����
	public ColorPoint() {  //������ ȣ��
		super(0, 0);  //�θ� Ŭ�����κ��� 0,0 �Է�, black
		color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y);  //�θ�Ŭ�������� ���
		color = "BLACK";
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;  //��ü ȣ��
	}
	public void setXY(int x, int y) {  //setXY �޼ҵ�
		move(x, y);
	}
	public void setColor(String color) {  //setColor��� �޼ҵ�
		this.color = color;
	}
	public String toString() {  //toString�̶�� �޼ҵ�
		return (color+"���� ("+getX()+","+getY()+")�� ��");
	}
}

public class Point2D {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) ��ġ�� BLACK ����
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10, 10); // (10,10) ��ġ�� BLACK ����
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");


	}

}
