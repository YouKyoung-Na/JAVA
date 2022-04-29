import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");  
		
		double o_x = scanner1.nextDouble();  //입력 받은 값 차례대로 변수에 저장, 원의 중심 x좌표
		double o_y = scanner1.nextDouble();  //원의 중심 y좌표
		double r= scanner1.nextDouble(); //원의 반지름
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("점 입력>>");  
		
		double a_x = scanner1.nextDouble();  //점 x좌표
		double a_y = scanner1.nextDouble();  //점 y좌표
		
		double distance = Math.sqrt((a_x-o_x)*(a_x-o_x)+(a_y-o_y)*(a_y-o_y));  //원의 중심과 점과의 거리
		
		if(distance<=r) //원의 중심과 점 사이의 거리가 반지름보다 작거나 같으면
			System.out.println("점 ("+a_x+","+ a_y+")은 원의 내부에 있습니다.");
		else
			System.out.println("점 ("+a_x+","+ a_y+")은 원의 내부에 없습니다.");
		
		scanner1.close();
		scanner2.close();
		
	}	
}
