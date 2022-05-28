interface Shape2 { // shape 인터페이스 - proj4에 이미 정의되어있으므로 2라고 붙임
	final double PI = 3.14; // 상수

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle2 implements Shape2 { // shape를 상속 받은 circle class proj4에 이미 정의되었으므로 2라고 붙임
	private int radius; // 원의 반지름, 접근지정자 private로 받아서 해당 클래스 내에서만 사용

	public Circle2(int radius) { // radius를 매개변수로 하는 circle 메서드
		this.radius = radius;
	}

	@Override
	public void draw() { // draw 메서드
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {  // getArea 메서드
		return PI * radius * radius;
	}
}

class Oval implements Shape2 {  //Shape2를 상속 받는 Oval 클래스
	private int a, b;  

	public Oval(int a, int b) {  //Oval 클래스
		this.a = a;  //필드 변수 a, b를 가져옴
		this.b = b;
	}

	@Override
	public void draw() {  // draw 메서드
		System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {  // getArea 메서드
		return PI * a * b;
	}
}

class Rect implements Shape2 {  //Shape2를 상속 받는 Rect 클래스
	private int a, b;  

	public Rect(int a, int b) {
		this.a = a;  //필드 변수 a, b를 가져옴
		this.b = b;
	}

	public void draw() {  // draw 메서드
		System.out.println(a + "x" + b + "크기의 사각형 입니다.");
	}

	public double getArea() {  // getArea 메서드
		return a * b;
	}
}

public class proj5 {
	public static void main(String[] args) {
		Shape2[] list = new Shape2[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle2(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("면적은 " + list[i].getArea());
	}
}
