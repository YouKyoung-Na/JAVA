package 과제3;
import java.util.Scanner;

class Grade{  //grade 클래스 생성
	private int math; //private 매개변수들
	private int science;
	private int english;
	
	Grade(int math, int science, int english){  //생성자와 매개변수 
		this.math = math;  //this로 객체 멤버 호출
		this.science = science;
		this.english= english; 
	}
	public int average(){  //메소드 리턴 타입 정수형
		return(math+science+english)/3;  //average 메소드 리턴 값
	}
}



public class GradeClass {
	public static void main(String[] args) {  //메인 메소드 (문제에 제시됨)
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
		int math = sc.nextInt();  //scanner에서 입력받은 값 scan
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);  //클래스에서 가져옴
		System.out.println("평균은 "+ me.average());  //average 메소드 가져옴
		
		sc.close();

	}

}
