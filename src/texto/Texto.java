/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

/**
 *
 * @author nicolas
 */
public class Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int a=0,d=1;
        FileReader file=new FileReader("myoutputfile.txt");
        
        BufferedReader leer=new BufferedReader(file);
        Scanner input=new Scanner(file);
        System.out.println("\nDato : "+d+"\n");
        d++;
        while(input.hasNext()){
            String num=input.nextLine();
           
           if(num.isEmpty()){
               System.out.println("\nDato : "+d+"\n");
               d++;
           }
           else
           {
                 if (Character.isLetter(num.charAt(0))==false)
                     System.out.println(num);
                     
                 
                
           }
            
                
               
              
            a++;   
        }
        
    }
    
}
