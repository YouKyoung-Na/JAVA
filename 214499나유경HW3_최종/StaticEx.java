package 과제3;

class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {  //concat = 배열 a와 b합침
		int arr[]= new int[a.length+b.length];  // a의 길이와 b의 길이를 합친 임시 배열 arr 만듦 
				
		for(int i=0;i<a.length ;i++) {  // a의 길이만큼 반복
			arr[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {  //a의 길이와 b의 길이를 합친만큼 반복
			arr[a.length+i] = b[i];  //배열 b도 저장
		}
		return arr;
	}
	public static void print(int[]a) {  //생성자 return 값 없으므로 void
		System.out.print("[");
		for(int i=0;i<a.length;i++) {  //a의 길이만큼 반복
			System.out.print(" "+a[i]+" ");
		}
		System.out.print("]");
	}
}

public class StaticEx {
	public static void main(String[] args) {  //메인 메소드
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
