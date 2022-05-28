package 과제3;
import java.util.Scanner;
import java.util.InputMismatchException;  //입력 예외처리 패키지
public class Multiply {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //scanner 사용
				
		while(true) {  //무한 루프 
			System.out.print("곱하고자 하는 두 수 입력>> ");
			try {  //try-catch문, 예외가 발생할 가능성이 있는 실행문
				int n = sc.nextInt();  //정수형 입력받아서 스캔
				int m = sc.nextInt();
				System.out.print(n+"x"+ m +"="+ n*m);
				break;
			}
			catch(InputMismatchException e) {  //예외 처리문, 객체 e에 예외 정보가 넘어옴
				System.out.println("실수는 입력하면 안됩니다.");  //예외 처리시 나타나는 문장
				sc.nextLine();  //다음 문장 읽어옴
			}
			
		}
				
		sc.close();

	}

}
