/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import java.util.Scanner;

public class bai5 {	
    
    
    
    
    int timMIN (int a, int b, int c){
        if(a<=b && a<=c)
            return a;
        if(b<=a && b<=c)
            return b;
        return c;
    }
    public static void main(String[] args) {
         
        
     
        bai5 obj = new bai5();
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("So qua CHANH");
        a = input.nextInt();
        System.out.println("So qua TAO");
        b = input.nextInt();
        System.out.println("So qua LE");
        c = input.nextInt();
        
        int a_= a/1;
        int b_= b/2;
        int c_= c/4;
        
        int min= obj.timMIN(a_, b_, c_);
        int sum= min*1+min*2+min*4;
        System.out.printf("Tong so toi da:%d(CHANH:%d,TAO:%d,LE:%d)",sum,min,min*2,min*4);
        input.close();
        
        
        
    }
}
    

