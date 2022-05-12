package 과제3;

public class Average {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<args.length; i++) {  //args는 매개변수, 매개변수의 길이만큼 반복
			sum += Integer.parseInt(args[i]);  //문자열을 정수로 변환, 전체의 수를 더함
		}
		System.out.printf("%d", sum/args.length);  //더한 값을 매개변수의 길이로 나누어서 평균구함
	}

}
