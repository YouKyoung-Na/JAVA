package app;  //app 패키지 
import base.Shape;  //base 패키지의 Shape 가져옴 
import derived.Circle;  // derived 패키지의 Circle 가져옴 

public class GraphicEditor {  // 문제에 제시된 코드 
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
