public class second {

	public static void main(String[] args) {
		
		double speed = 300_000*3600*24*365;  //���� �ʴ� �ӵ� �⵵�� ��ȯ 		
		double distance = 40 * Math.pow(10,12);  //�Ÿ� pow �޼ҵ�� 10�� 12��
		double result = (distance/speed);  //�ð��� �Ÿ��� �ӵ��� ���� ��

		System.out.println("�ɸ��� �ð��� �� "+result+" ���� �Դϴ�.");
	}
} 