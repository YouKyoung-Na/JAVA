public class Hello1 {
	
	public static int sum(int n, int m) {  
		return n+m;		
	}
	
	public static void main(String[] args) {  //main 메소드에서 시작
		int i =20;  
		int s;
		char a;
		
		s=sum(i, 10);  //sum 메소드 호출
		a='?';
		System.out.println(a);  //문자 '?' 화면 출력
		System.out.println("Hello");  //문자열 hello 출력
		System.out.println(s);  //정수 s값 화면 출력
	}

}
