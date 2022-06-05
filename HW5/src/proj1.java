class Circle{  //circle 클래스 생성, 접근지정자는 default 
	int x,y,radius; 
	public Circle(int x, int y, int radius) {  //circle 메서드 생성  
		this.x = x;  // x, y, radius 를 this로 가져옴 
		this.y = y;
		this.radius = radius;		
	}
	public String toString() {  //Circle 객체를 문자열로 리턴하는 toString() 메서
		return "Circle(" + x +","+ y +") 반지름"+radius;
	}
	public boolean equals(Object obj) {   //원이 같은지 판별
		Circle p = (Circle)obj;
		if(x==p.x && y ==p.y) return true; //객체의 중심이 같으면 같은 것으로 판별 
		else return false;
	}
}

public class proj1 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);  //중심 2,3에 반지름이 5인 원 
		Circle b = new Circle(2, 3, 30);  //중심 2,3에 반지름 30인 원  
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b))
			System.out.println("같은 원 ");
		else
			System.out.println("서로 다른 원 ");
	}
}