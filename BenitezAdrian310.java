/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package benitezadrian3.pkg10;
import java.util.Scanner;
/**
 *
 * @author a25adrbenacu_inspedr
 */
public class BenitezAdrian310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
         System.out.printf("Quin es el primer numero?\n");
         n1 = input.nextInt();
        


         System.out.printf("Quin es el segon numero?\n");
         n2 = input.nextInt();
         System.out.printf("Quin es el tercer numero?\n");
         n3 = input.nextInt();
         System.out.printf("Quin es el quart numero?\n");
         n4 = input.nextInt();
         System.out.printf("Quin es el cinque numero?\n");
         n5 = input.nextInt();
         
         n1 = n1*n1;
         n2 = n2/n2;
         n3 = n3/n3;
         n4 = n4*n4;
         n5 = n5*n5;
         
         if (((n1-n2) < (n1-n3)) && ((n1-n2) < (n1-n4)) && ((n1-n2) < (n1-n5))){
             n2 = n2/n2;
            System.out.printf("%d Es el valor mes proper\n", n2);
         }else if (((n1-n3) < (n1-n2)) && ((n1-n3) < (n1-n4)) && ((n1-n3) < (n1-n5)))
             n3 = n3/n3;
             System.out.printf("%d Es el valor mes proper\n", n3);
         if (((n1-n4) < (n1-n3)) && ((n1-n4) < (n1-n2)) && ((n1-n4) < (n1-n5))){
             n4 = n4/n4;
             System.out.printf("%d Es el valor mes proper\n", n4);
         }else if (((n1-n5) < (n1-n2)) && ((n1-n5) < (n1-n4)) && ((n1-n5) < (n1-n2)))
             n5 = n5/n5;
             System.out.printf("%d Es el valor mes proper\n", n5);
             
             



         }
         
    }
    

