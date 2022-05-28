import java.util.Scanner;  //모듈 사용

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");  //화면 출력
			Scanner scanner = new Scanner(System.in); //입력 값 스캔(공백으로 분리하여)
			
			String name = scanner.next();  //1번 값 name에 대입
			System.out.print("이름은 " + name + ", ");
			
			String city = scanner.next();  //2번 값 city에 대입
			System.out.print("도시는 " + city + ", "); 
			
			int age = scanner.nextInt();  //3번 값 age에 대입
			System.out.print("나이는 " + age + "살, ");  
			
			double weight = scanner.nextDouble();  //4번 값 weight에 대입
			System.out.print("체중은 " + weight + "kg, ");
			
			boolean single = scanner.nextBoolean();  //5번 값 single 에 대입
			System.out.print("독신 여부는 " + single + "입니다.");
			
			scanner.close();
	}

}
