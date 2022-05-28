public class hw4 { 
	public static void main(String[] args) { 
		int n [][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}}; 
		
		for(int i=0; i<n.length; i++) {  //배열 길이만큼 반복
			for(int j=0; j<n[i].length; j++) {  //배열의 첫 원소 길이만큼 반복
				System.out.print(n[i][j] + " "); } 
			System.out.println(); 
		} 
	} 
}

