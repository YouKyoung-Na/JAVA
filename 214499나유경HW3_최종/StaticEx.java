package ����3;

class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {  //concat = �迭 a�� b��ħ
		int arr[]= new int[a.length+b.length];  // a�� ���̿� b�� ���̸� ��ģ �ӽ� �迭 arr ���� 
				
		for(int i=0;i<a.length ;i++) {  // a�� ���̸�ŭ �ݺ�
			arr[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {  //a�� ���̿� b�� ���̸� ��ģ��ŭ �ݺ�
			arr[a.length+i] = b[i];  //�迭 b�� ����
		}
		return arr;
	}
	public static void print(int[]a) {  //������ return �� �����Ƿ� void
		System.out.print("[");
		for(int i=0;i<a.length;i++) {  //a�� ���̸�ŭ �ݺ�
			System.out.print(" "+a[i]+" ");
		}
		System.out.print("]");
	}
}

public class StaticEx {
	public static void main(String[] args) {  //���� �޼ҵ�
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
