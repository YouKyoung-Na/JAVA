interface Shape { // shape �������̽�
	final double PI = 3.14; // ���

	void draw(); // ������ �׸��� �߻� �޼ҵ�

	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle implements Shape { // shape�� ��� ���� circle class
	public int radius; // ���� ������

	public Circle(int radius) { // radius�� �Ű������� �ϴ� circle �޼���
		this.radius = radius;
	}

	@Override
	public void draw() { // draw �޼���
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() { // getArea �޼���
		return PI * radius * radius;
	}
}

public class proj4 {
	public static void main(String[] args) { // ���θ޼���
		Shape donut = new Circle(10); // �������� 10�� �� ��ü
		donut.redraw();  //interface�� ����Ʈ �޼���� ��
		System.out.println("������ " + donut.getArea());
	}
}
