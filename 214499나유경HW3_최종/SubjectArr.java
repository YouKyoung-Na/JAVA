package 과제3;
import java.util.Scanner;

public class SubjectArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //입력 받음
		String course []= {"Java", "c++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score []= {95,88,76,62,55};  //점수 배열
		String name="";  // name의 문자열 초기화
		int count = 0;   //count 값 0으로 초기화
		
		while(true) {  //무한루프
			System.out.print("과목 이름>> ");
			name = sc.next();
			if(name.equals("그만"))  
				break;  //그만을 입력받으면 무한루프 탈출
			
			for(int i=0; i<course.length; i++) {  //course의 길이 만큼 반복
				if(course[i].equals(name)) {  //과목명이 course[i]의 문자열과 같은 경우
					System.out.println(course[i]+"의 점수는 "+score[i]);  
					  //course의 인덱스와 동일한 score 점수 출력
					count++;  //일치하는 과목이 있을 때마다 count를 늘려줌
				}
			}
			if(count == 0)  //count가 0 == 일치하는 과목이 없음
				System.out.println("없는 과목입니다.");
		}
		sc.close();
	}

}
