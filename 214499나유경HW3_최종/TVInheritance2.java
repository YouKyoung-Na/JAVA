package ����3;

class TV3{  //���� �б��� ���� tv,tv2�� �����Ƿ� tv3��� ����
	private int size;  // ������ �Ű����� size
	public TV3(int size) {this.size=size;}
	protected int getSize() {return size;}  //protected�� ���ټ��� ����
}

class ColorTV2 extends TV3{  //tv3�� ��ӹ��� colortv2 Ŭ����
	private int result;  //�Ű����� result
	
	ColorTV2(int size, int result){  //�����ڿ� �Ű�����
	super(size);  //�θ�Ŭ������ size
	this.result = result;
	}
	
	public void printProperty(){  //printProperty �޼ҵ�
	System.out.print(getSize()+"��ġ "+ result +"�÷�");
	}
}

class IPTV extends ColorTV2 {  //ColorTV2�� ��ӹ��� IPTV
	private String IP;
	public IPTV(String IP, int size, int color) {  //IPTV �����ڿ� �Ű�����
		super(size, color);  //�θ�Ŭ������ size�� color ������
		this.IP = IP;  //�Ű����� ȣ��
	}
	protected String getIP() { return IP; }
	public void printProperty() {
		System.out.print("���� IPTV�� "+getIP()+" �ּ��� ");  //��°�
		super.printProperty();  //�θ�Ŭ������ printproperty�� ������
	}
}

public class TVInheritance2 {
	public static void main(String args[]) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" �ּҿ� 32��ġ, 2048 �÷�
		iptv.printProperty();
	}

}
