import java.util.Scanner;
public class proj3 {

	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		char c=s.charAt(0); //문자열의 첫번째 문자
		
		if(c<'a'||c>'z') {  //문자가 a보다 작거나 z보다 큰 경우(소문자가 아닌 경우)
			System.out.println("소문자가 아닙니다.");			
		}
		
		else {
			for(int i=c; i>='a'; i--) { //i가 c랑 같을 때부터 a보다 크거나 같을 때까지 하나씩 값이 줄어듬
				for (char j = 'a'; j<=i; j++) { 
					System.out.print(j);
				}
				System.out.println();
			}
		}
		scanner.close();
	}

}
