package ����3;

class TV{  //TV Ŭ���� ���� 
	private String name;  //name ���ڿ� , private ���� ������
	private int year;   //year ������, private ���� ������
	private int inch;
	
	TV(String name, int year, int inch){  //TV ������ ����
		this.name = name;  //this�� ��ü ��� ȣ��
		this.year = year;
		this.inch = inch;
	}
	public void show() {  //show��� �޼ҵ带 public ����� ����
		System.out.println(name+"���� ���� "+ year + "���� " + inch+"��ġ TV");
	}
}

public class TvClass {  //���� �޼ҵ�
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
