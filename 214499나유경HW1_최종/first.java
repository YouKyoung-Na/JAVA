import java.util.Scanner;
public class first {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>> ");  //화면에 출력
		
		int num = scanner.nextInt();  //입력된 값을 int형으로 스캔
		int one = num%10;  //num을 10으로 나눈 나머지 값이 일의 자리
		int ten = num/10;  //num을 10으로 나눈 몫이 십의 자리
		
		if(num>=10&&num<=99) {  //10이상이거나 99이하일 경우를 설정(두자리수)
			if(ten==one)  //십의자리와 일의 자리가 같다면
				System.out.println("Yes! 10의자리와 1의자리가 같습니다.");
			
			else  //십의 자리와 일의 자리가 다르다면
				System.out.println("No! 10의자리와 1의자리가 다릅니다.");				
		}
		
		else {  //두자리수가 아닌 경우
			System.out.println("2자리수의 정수를 입력해주세요.");
		}
			
		scanner.close();
	}
}
