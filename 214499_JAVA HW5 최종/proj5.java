import java.util.ArrayList;
import java.util.Scanner;

public class proj5 {
	public static void main(String[] args) {
		ArrayList<Character> stack = new ArrayList<Character>();  // Arraylist 생성 
		Scanner sc = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		
		for (int i = 0; i < 6; i++) {
			char c = sc.next().charAt(0);  // char형 스캔 
			stack.add(c);  //arraylist에 요소 삽입, arraylist에는 문자열만 가능함 
		}
		
		int sum = 0;  // sum 초기화 
		for (int i = 0; i < stack.size(); i++) {  //스택 사이즈만큼 반복 
			char c = stack.get(i);  // 스택의 i번째 값 리턴 
			
			switch (c) {
			case 'A':  // 학점 및 점수 
				sum += 4;
				break;
			case 'B':
				sum += 3;
				break;
			case 'C':
				sum += 2;
				break;
			case 'D':
				sum += 1;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		
		double result = (double) sum / stack.size();  // 평균 출력 
		System.out.println(result);
		sc.close();
	}
}
