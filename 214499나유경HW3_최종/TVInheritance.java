package ����3;

class TV2{  //���� �б��� ���� tv�� �����Ƿ� tv2��� ����
	private int size;  // ������ �Ű����� size
	public TV2(int size) {this.size=size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV2{  //tv2�� ��ӹ��� colortv Ŭ����
	private int result;  //�Ű����� result
	
	ColorTV(int size, int result){  //�����ڿ� �Ű�����
	super(size);  //�θ�Ŭ������ size
	this.result = result;
	}
	
	public void printProperty(){  //printProperty �޼ҵ�
	System.out.print(getSize()+"��ġ "+ result +"�÷�");
	}
}

public class TVInheritance {  //���� �޼ҵ�
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();	
	}
}