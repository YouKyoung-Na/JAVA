package ����3;
class Point2 {  //point2 Ŭ����(��ġ�� Ŭ���� �־ point2�� ����)
	private int x, y;
	public Point2(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class Point3D extends Point {  //point Ŭ���� ��ӹ��� point3dŬ����
	private int z;  //������ ���� z(3���� ����) ����
	public Point3D(int x, int y, int z) {  //������ �޼ҵ�
		super(x, y);  //�θ�Ŭ�������� ��ӹ���
		this.z = z;  //������ ȣ��
	}
	public int getZ() {  //z ����
		return z;
	}
	public void moveUp() {  //�ö� �� z ���� ����
		z++;
	}
	public void moveDown() {  //������ �� z ���� ����
		z--;
	}
	public String toString() {
		return ("("+getX()+","+getY()+","+getZ()+")�� ��");
	}
	protected void move(int x, int y, int z) { 
		move(x, y);
		this.z = z; 
	}
	
}

public class Point3D_prac {

	public static void main(String args[]) {
		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3�� ���� x, y, z���� ��.
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp(); // z ������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveDown(); // z ������ �Ʒ��� �̵�
		p.move(10, 10); // x, y ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100, 200, 300); // x, y, z ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");

	}

}
