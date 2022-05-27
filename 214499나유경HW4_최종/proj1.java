//������ ���õ� �ڵ�
class Point{  //point Ŭ����
	private int x,y;
	public Point(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}	
}

class PositivePoint extends Point{  //pointŬ������ ��ӹ��� PositivePoint Ŭ����
	
	@Override  //�������̵� Ȯ��
	protected void move(int x, int y) {  //move �޼ҵ�	
		if(x>0 && y>0) {
			super.move(x, y);  //�θ�Ŭ������ x, y ������
		}		
	}
	public PositivePoint() {  //PositivePoint �޼���
		super(0,0);  //�θ�Ŭ������ x,y�� 0,0���� ������(�������̵�)
	}
	public PositivePoint(int x, int y) {  
		super(x, y);  //�θ�Ŭ������ x,y�� �״�� ������-�������ε�
		if(x<=0 || y <= 0) {  //x, y�� �������
			super.move(0, 0);  //x,y ���� 0���� ��ȯ��
		}		
	}
	public String toString() {  //toString �޼���, �ڹٿ��� ���� String�� ����
		String result = "("+getX()+","+getY()+")�� ��";
		return result;
	}
	
}

public class proj1 {  //���� ���õ� ���� �޼ҵ�
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();  //������PositivePoint�� ��üp ����
		p.move(10,10);  //�������ε� �Ǿ� 10,10 ��ȯ��
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.move(-5,5);  //��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString()+"�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);  //-10�� �����̹Ƿ� 0���� ��ȯ��
		System.out.println(p2.toString()+"�Դϴ�.");
	}
}
