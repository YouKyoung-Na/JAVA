class TV{
		private int size;
		public TV(int size) {this.size=size;}
		protected int getSize() {return size;}
	}

class ColorTV extends TV{
	private int result;
	ColorTV(int size, int result){
		super(size);
		this.result = result;
	}
	public void printProperty(){
		System.out.print(getSize()+"��ġ "+ result +"�÷�");
	}
}

public class pro1 {	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		
	}
}
