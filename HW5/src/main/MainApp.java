package main;
import etc.Calc;  //etc 패키지의 Calc 클래스 사용 

public class MainApp {  //MainApp 클래스는 main 패키지에 저장
	public static void main(String[] args) {
		Calc c = new Calc(10,20);
		System.out.println(c.sum());
	}
}
