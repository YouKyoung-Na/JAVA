import java.util.Scanner;
interface Stack{  //문제에서 제시된 코드
	int length();  //현재 스택에 저장된 개수 리턴
	int capacity();  //스택의 전체 저장 가능한 개수 리턴
	String pop();  //스택의 톱에 실수 저장
	boolean push(String val);  //스택의 톱에 저장된 실수 리턴
}

class StringStack implements Stack{  //인터페이스 구현
	public int num;  //스택에 저장 공간 크기
	public int index;  //저장 인덱스  
	public String[] stack;
	public StringStack(int num) {  //StringStack 메서드
		this.num = num;  //필드 변수 받아옴
		this.index = index; 
		stack = new String[num];
	}
	public int length() {  //length 메서드, 인터페이스에 제시된 메서드 코드 구현
		return index;  //저장 인덱스를 리턴함
	}
	public int capacity() {  //capacity 메서드, 위와 동일
		return stack.length;  //스택의 저장 인덱스 리턴
	}
	public String pop() {
		if(index-1<0)  //Stack 에 아무것도 안들어왔을 때
			return null;
		index--;  //스택의 인덱스값을 내려줌 
		String str = stack[index];  // 스트링 변수
		return str;
	}
	public boolean push(String val) {  
		if (index<num) {  //스택 최상위 값(맨 마지막에 들어온 값)의 인덱스가 스택의 크기보다 작을 때
			stack[index]=val;
			index++;  //stack 최상위 값의 인덱스 올려줌
			return true;
		}
		else 
			return false;  //스택이 다 찼으면 false값 리턴
	}
}

public class proj2 {  //StackApp클래스 명칭 대신에 proj2 이름 씀
	public static void main(String[] args) {		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		Scanner sc = new Scanner(System.in);  //스캔 
		int num = sc.nextInt();  //스캔 값 num에 받아옴
		StringStack stack = new StringStack(num);  
		while(true) {  //무한반복
			 System.out.print("문자열 입력 >> ");
			 String val = sc.next();
			 if(val.equals("그만"))  //그만이라는 값이 입력되었으면
				 break;
			 if(!stack.push(val)) {  //스택 푸시에 실패했을 시
				 System.out.println("스택이 꽉차서 푸시 불가!");
			 }
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");		
		int len = stack.length();  //for문에서 바로 우항 입력하면 한개 짤림
		for(int i=0; i<len; i++) {  //스택의 길이만큼 반복, i<=len으로 하면 null값까지 출력
			String str = stack.pop();  //str변수에서 stack의 최상위값 pop
			System.out.print(str+" ");  //공백으로 문자 구분
		}
	}
}
