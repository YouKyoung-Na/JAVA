public class hw6 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int arr[][] = new int[4][4];
      int x, y, result=0;//result는 랜덤 생성 갯수

      while(result < 10) {
         x = (int)(Math.random()*4); //x에 0~4까지의 랜덤 수 넣기
         y = (int)(Math.random()*4); //y에 0~4까지의 랜덤 수 넣기
         if(arr[y][x]==0) { //arr[x][y]에 값이 없으면 랜덤 수 넣기
            arr[y][x] = (int)(Math.random()*10+1);
            result++;
         }
      }
      
      for(int i=0; i<arr.length; i++) {
         for(int j=0; j<arr[i].length; j++) {
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
   }

}