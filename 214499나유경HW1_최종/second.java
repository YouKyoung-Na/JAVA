public class second {

	public static void main(String[] args) {
		
		double speed = 300_000*3600*24*365;  //빛의 초당 속도 년도로 전환 		
		double distance = 40 * Math.pow(10,12);  //거리 pow 메소드는 10의 12승
		double result = (distance/speed);  //시간은 거리를 속도로 나눈 것

		System.out.println("걸리는 시간은 약 "+result+" 광년 입니다.");
	}
} 