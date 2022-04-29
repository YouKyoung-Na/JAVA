public class Third {
	public static void main(String[] args) {
		
		double rocket_speed = 60_000;   //보이저 로켓의 속도	단위:km/h	
		double distance = 40*Math.pow(10,12); //항성과 지구 간의 거리: km
		double result = distance / rocket_speed; 
		
		System.out.println(result+" 시간");

	}

}