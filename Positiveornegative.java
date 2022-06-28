import java.util.Scanner;                                       //import scanner package here

public class positiveornegitive {

    public static void main(String[] args){
        
        System.out.print("Enter the number to check it's Positive or Negative : ");
        Scanner scan = new Scanner(System.in);                                 
        int num1 = scan.nextInt();                                               

        if(num1<0){                                                     
            System.out.println("It's a Negative number");          
        }else{
            System.out.println("It's a Positive number");                
        }
    
    }   
}
