import java.util.Scanner; 
public class hw1 {
 
    public static void main(String[] args) {        
        
        System.out.print("���� ������ �Է��Ͻÿ�.: ");
        Scanner scanner1 = new Scanner(System.in);
               
        int num1 = scanner1.nextInt();       
        
        
        if(num1>0) {  //num=�Է¹޴°�, a=�����°�
        	for(int a=1; a<=num1; a++){  //a�� num�� ������ ������ �ݺ�
                if((num1%a)==0){
                    System.out.println(num1+"�� ����� ������ �����ϴ�."+a);
                }
            }        	
        }
        else if (num1<=0){  
        	System.out.print("���� ������ �ƴմϴ�. �ٽ� �Է��ϼ���: ");
        	Scanner scanner2 = new Scanner(System.in);
        	int num2 = scanner1.nextInt();
        	
        	for(int b=1; b<=num2; b++){  //num=�Է¹޴°�, b=�����°�
                if((num2%b)==0){
                    System.out.println(num2+"�� ����� ������ �����ϴ�."+b); //b�� num�� ������ ������ �ݺ�
                }
            }        	
        	
        }            
        scanner1.close();               
        }    
}

