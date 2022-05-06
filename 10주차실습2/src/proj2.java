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
}

class IPTV extends ColorTV{
		private String IP;
		IPTV(String IP, int size, int result){
			super(size, result);
			this.IP = IP;
		}
		public void printProperty(){
			System.out.print("나의 IPTV는 "+ IP +"주소의"+"");
		}
	}

public class proj2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}	
}