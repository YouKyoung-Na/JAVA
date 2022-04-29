import java.util.Scanner;
public class game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		int num = scanner.nextInt();
		int ten = num / 10; //num변수의 10의 자리 숫자
		int first = num % 10; //num변수의 1의 자리 숫자
		
		if (num<10 && num >=1) {  //숫자가 한자리 수인 경우
			if (num==3||num==6||num==9)
				System.out.println("박수짝");
			else
				System.out.println("넘어감");
		}
		
		
		else if (num>=10 && num<=99) {  //숫자가 두자리 수인 경우
			if(ten == first) {  //십의 자리 수와 일의 자리 수가 같은 경우
				if(ten== 3||ten==6||ten==9) 
					System.out.println("박수짝짝");
				else
					System.out.println("넘어감");
			}
			else if(ten==3||ten==6||ten==9)  //십의 자리 숫자가 3,6,9인 경우
				System.out.println("박수짝");
			
			else if(first==3||first==6||first==9) //일의 자리 숫자가 3,6,9인 경우
				System.out.println("박수짝");
			else
				System.out.println("넘어감");
		}
		else
			System.out.print("1~99까지의 정수를 입력하시오.");
		
		scanner.close();

	}

}
