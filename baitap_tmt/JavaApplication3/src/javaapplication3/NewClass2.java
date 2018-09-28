/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class NewClass2 {
           public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so ");
        long $a = nhap.nextLong();
        int $A = 0;
        for (int $i = 1 ; $i < $a-1; $i++) {
            if($a%$i==0)
            {
                $A = $A + $i;
            }
        }
        if($a==$A)
        {
            System.out.println("So hoan hao");
        }
         else
        {
            System.out.println("k phai la so hoan hao");
        }
    }
    
} 
