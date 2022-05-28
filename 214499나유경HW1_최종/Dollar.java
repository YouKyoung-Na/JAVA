import java.util.Scanner;
public class Dollar {

	public static void main(String[] args) {
		System.out.println("원화를 입력하세요(단위 원)");   // 입력하라는 말 화면에 출력
			Scanner a = new Scanner(System.in);  //입력된 값 스캔
			
			int money = a.nextInt();  //입력값 money라는 정수형 변수에 넣음
			System.out.print(money + "원은 ");  //money값과 원은 화면에 출력
			
			int rate = 1100;  
			float result = money / rate;  //money를 rate로 나눔
			
			System.out.println("$" + result +"입니다.");  //$, result 값과, '입니다' 출력
			
	}

}
