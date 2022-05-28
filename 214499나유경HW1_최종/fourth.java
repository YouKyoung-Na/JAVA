import java.util.Scanner;  //scanner 모듈 사용
public class fourth {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이차항의 계수 a,b,c를 빈칸으로 분리하여 입력하시오.");  //화면에 출력
		
		int a = scanner.nextInt();  //입력 받은 값 차례대로 변수에 저장
		int b= scanner.nextInt();
		int c = scanner.nextInt();
		
		double expression = (b*b)-(4*a*c);  // 공식 double형
		double root = Math.sqrt(expression); // expression에 루트 
		
		double x1=(-b+root)/(2*a);
		double x2=(-b-root)/(2*a);
		
		System.out.println("이차방정식의 근은 " + x1 + "과" + x2 +" 입니다.");
		
		scanner.close();
	}

}