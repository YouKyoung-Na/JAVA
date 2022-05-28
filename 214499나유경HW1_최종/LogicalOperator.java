public class LogicalOperator {
	public static void main(String[] args) {
		//비교 연산
		System.out.println('a' > 'b');  //문자열 비교 f
		System.out.println( 3 >= 2);  //t
		System.out.println(-1 < 0);  //t
		System.out.println(3.45 <=2);  //f
		System.out.println(3==2);  //f
		System.out.println(3 !=2);  //t
		System.out.println(!(3 !=2));  //f
		
		//논리 연산
		System.out.println((3>2)&&(3>4));  //&&는 and 연산자 f
		System.out.println((3!=2)||(-1>0));  // ||은 or 연산자 t
	}

}
