
package hinsothon;
import java.util.Scanner;
public class HinSothon {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("please enter coordinates of the center(enter before input the next Value):");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("please enter the radius of the circle");
        int r = input.nextInt();
        System.out.println("please enter coordinates of the center(enter before input the next Value):");
        int a = input.nextInt();
        int b = input.nextInt();
        int j = a-x;
        int k = b-y;
        if ( j*j + k*k <= r*r){
        System.out.println("This point is inside.");
    }
        else{
                System.out.print("This point is outside.");
                }
    }
            
}
        
    
    

