interface Shape2 { // shape �������̽� - proj4�� �̹� ���ǵǾ������Ƿ� 2��� ����
	final double PI = 3.14; // ���

	void draw(); // ������ �׸��� �߻� �޼ҵ�

	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle2 implements Shape2 { // shape�� ��� ���� circle class proj4�� �̹� ���ǵǾ����Ƿ� 2��� ����
	private int radius; // ���� ������, ���������� private�� �޾Ƽ� �ش� Ŭ���� �������� ���

	public Circle2(int radius) { // radius�� �Ű������� �ϴ� circle �޼���
		this.radius = radius;
	}

	@Override
	public void draw() { // draw �޼���
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {  // getArea �޼���
		return PI * radius * radius;
	}
}

class Oval implements Shape2 {  //Shape2�� ��� �޴� Oval Ŭ����
	private int a, b;  

	public Oval(int a, int b) {  //Oval Ŭ����
		this.a = a;  //�ʵ� ���� a, b�� ������
		this.b = b;
	}

	@Override
	public void draw() {  // draw �޼���
		System.out.println(a + "x" + b + "�� �����ϴ� Ÿ���Դϴ�.");
	}

	@Override
	public double getArea() {  // getArea �޼���
		return PI * a * b;
	}
}

class Rect implements Shape2 {  //Shape2�� ��� �޴� Rect Ŭ����
	private int a, b;  

	public Rect(int a, int b) {
		this.a = a;  //�ʵ� ���� a, b�� ������
		this.b = b;
	}

	public void draw() {  // draw �޼���
		System.out.println(a + "x" + b + "ũ���� �簢�� �Դϴ�.");
	}

	public double getArea() {  // getArea �޼���
		return a * b;
	}
}

public class proj5 {
	public static void main(String[] args) {
		Shape2[] list = new Shape2[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circle2(10); // �������� 10�� �� ��ü
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40); // 10x40 ũ���� �簢��
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}
}
