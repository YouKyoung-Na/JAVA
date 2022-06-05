import java.util.Scanner;
import java.util.Vector;

public class proj4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while (true) {  // 무한 반복문 
			int n = sc.nextInt();
			if (n == -1) {  // n에 -1이 입력되면 
				break;  // 무한루프 탈출 
			}
			v.add(n);  // add 메서드 사용해서 벡터에 요소 삽입 
		}
		int max=v.get(0);  // 맨 처음 수를 최댓값으로 초기화 
		for(int i=1;i<v.size();i++) {  // 벡터가 포함하는 개수까지 반복 
			if(max<v.get(i)) {  // 인덱스 i번째 요소 리턴 
				max=v.get(i);
			}
		}
		System.out.println("가장 큰 수는 "+max);
	}
}
