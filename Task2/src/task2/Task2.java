/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author amna(2020-CS-123)
 */
import java.util.Scanner;

public class Task2{
  public static void displayVertical(String b){

    if(b != null && !"".equals(b)){
        int stringLength = b.length();

        for (int i=0; i<stringLength; i++){
            System.out.println(b.charAt(i));
        }

    }

}
  public static void main(String [] args){
      
    System.out.println("enter the sentence");
    
        Scanner obj=new Scanner(System.in);
        
        String b=obj.nextLine();
        
        //calling the function
        displayVertical(b);
        
    
 
  }
}
      
    
        
    

