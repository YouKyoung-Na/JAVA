public class LogicalOperator {
	public static void main(String[] args) {
		//�� ����
		System.out.println('a' > 'b');  //���ڿ� �� f
		System.out.println( 3 >= 2);  //t
		System.out.println(-1 < 0);  //t
		System.out.println(3.45 <=2);  //f
		System.out.println(3==2);  //f
		System.out.println(3 !=2);  //t
		System.out.println(!(3 !=2));  //f
		
		//�� ����
		System.out.println((3>2)&&(3>4));  //&&�� and ������ f
		System.out.println((3!=2)||(-1>0));  // ||�� or ������ t
	}

}
