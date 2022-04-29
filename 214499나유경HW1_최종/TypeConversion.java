public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;  
		int i =100;
		
		System.out.println(b+i);  //정수형으로 자동 타입변환
		System.out.println(10/4);  //int형으로 자동 타입 변환
		System.out.println(10.0/4);  // 실수형으로 자동 타입 변환
		System.out.println((char)0x12340041);  //문자형으로 강제 타입변환
		System.out.println((byte)(b+i));  //byte형으로 강제 타입 변환
		System.out.println((int)2.9+1.8);  // int형으로 강제 타입 변환
		System.out.println((int)(2.9+1.8));  // int 형으로 강제 타입 변환
		System.out.println((int)2.9+(int)1.8);	//int 형으로 강제 타입 변환
	}

}