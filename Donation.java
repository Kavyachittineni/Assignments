
import java.util.Scanner;
public class Donation {
    public static void main(String[] args){

        System.out.print("Enter your age here :");          
        Scanner scan = new Scanner(System.in);                  
        int age = scan.nextInt();                               
        System.out.print("Enter your weight here :");       
        int weight = scan.nextInt();                            

        if(age>18 && weight>40){                                            
            System.out.println("He's eligible for blood donate.");      
        }else{
            System.out.println("He's not eligible for blood donate.");  
        }
    }
}