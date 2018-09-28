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
public class NewClass1 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so ");
        int $a = nhap.nextInt();
        int $A = 1;
        for (int $i = 2 ; $i < $a-1; $i++) {
            if($a%$i==0)
            {
                $A++;
            }
        }
        if($A==2)
        {
            System.out.println(" kf So nguyen to");
        }
         else
        {
            System.out.println("so nguyen to");
        }
    }
    
}
