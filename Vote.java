import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        
        System.out.print("Enter the person age to check vote eligibility : ");
        Scanner scan = new Scanner(System.in);                                  
        int a = scan.nextInt();                                                 
        
        if(a>=18){                                                         
            System.out.println("He's eligible for vote..");                   
        }else{
            System.out.println("He's not eligible for vote..");
        }
    }   
}

