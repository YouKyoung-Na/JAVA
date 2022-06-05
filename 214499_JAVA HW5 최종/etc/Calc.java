package etc;

public class Calc{  //문제에 제시된 코드, default 접근지정자는 타 패키지 접근이 불가능 하므로 public 으로 바
	private int x,y;
	public Calc(int x, int y) {this.x = x; this.y=y;}
	public int sum() {return x+y;}
}
