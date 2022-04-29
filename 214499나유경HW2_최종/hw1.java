import java.util.Scanner; 
public class hw1 {
 
    public static void main(String[] args) {        
        
        System.out.print("양의 정수를 입력하시오.: ");
        Scanner scanner1 = new Scanner(System.in);
               
        int num1 = scanner1.nextInt();       
        
        
        if(num1>0) {  //num=입력받는값, a=나누는값
        	for(int a=1; a<=num1; a++){  //a가 num과 같아질 때까지 반복
                if((num1%a)==0){
                    System.out.println(num1+"의 약수는 다음과 같습니다."+a);
                }
            }        	
        }
        else if (num1<=0){  
        	System.out.print("양의 정수가 아닙니다. 다시 입력하세요: ");
        	Scanner scanner2 = new Scanner(System.in);
        	int num2 = scanner1.nextInt();
        	
        	for(int b=1; b<=num2; b++){  //num=입력받는값, b=나누는값
                if((num2%b)==0){
                    System.out.println(num2+"의 약수는 다음과 같습니다."+b); //b가 num과 같아질 때까지 반복
                }
            }        	
        	
        }            
        scanner1.close();               
        }    
}

