import java.util.Scanner;
public class hw7 {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("정수 몇개?>>" );
	   
	   int n = scanner.nextInt();
	   int arr[]= new int[n];
	   
	   for(int i=0; i<n; i++) {
		   int a = (int)(Math.random()*100+1);		   
		   
		   if(i==0) {
			   arr[i]=a;
			   System.out.print(arr[i]+ " ");
		   }
		   
		   for(int j=0; j<i; j++) {
			   if(arr[j]==a) {
				   i--;
				   break;
			   }
			   if(j==i-1) {
				   arr[i] = a;
				   System.out.print(arr[i]+" ");
				   if(i%10==9)
					   System.out.println();
			   }
		   }
	   }
	   scanner.close();   
   }
}