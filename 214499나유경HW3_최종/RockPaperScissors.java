package 과제3;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //입력 받음
		String str[]= {"가위", "바위", "보"};
		String User;
		String Computer;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do {  //do-while 반복문
	         System.out.print("가위 바위 보! >> ");
	         User = sc.next();
	        if(User.equals("그만"))  //user가 그만이라고 하면 종료
	        	 break;
	        int n = (int)(Math.random()*3);  //랜덤 수 0~2
	         Computer =str[n];   //컴퓨터가 내는 값 = str[n]의 값
			
			if(User.equals("가위")) {  //user가 가위라고 했을 때
	            if(str[n].equals("가위")) {  //컴퓨터도 가위라고 했을 때 
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {  //컴퓨터가 바위라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 사용자가 졌습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {  //컴퓨터가 보라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 사용자가 이겼습니다.");
	               continue;
	            }
	         }
	         else if(User.equals("바위")) {  //user가 바위라고 했을 때
	            if(str[n].equals("가위")) {  //컴퓨터가 가위라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {  //컴퓨터가 바위라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {  //컴퓨터가 보라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+ " 사용자가 졌습니다.");
	               continue;
	            }
	         }
	         else if(User.equals("보")) {  //user가 보라고 했을 때
	            if(str[n].equals("가위")) {  //컴퓨터가 가위라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 사용자가 졌습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {  //컴퓨터가 바위라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {  //컴퓨터가 보라고 했을 때
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Computer+" 비겼습니다.");
	               continue;
	            }
	         }
	         System.out.print("사용자 = "+User+" , 컴퓨터 = "+Computer+" ");
	      }
		  while(true);
	      	System.out.println("게임을 종료합니다...");
	      	sc.close();
	   }

}


