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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so ");
        int $a = nhap.nextInt();
        int $A = 0;
        for (int $i = 1 ; $i < $a-1; $i++) {
            if($a%$i==0)
            {
                $A = $A +$i;
            }
        }
        if($a==$A)
        {
            System.out.println("So hoan hoan");
        }
         else
        {
            System.out.println("kf la so hoan hoan");
        }
    }
}
