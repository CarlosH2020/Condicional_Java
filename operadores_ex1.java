/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class operadores_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número:");
        num = leitor.nextInt();
        System.out.println();
        
        if(num >=20 && num <=90 ){
            System.out.printf("Número %d está entre 20e90\n",num);
        }else{
            System.out.println("Esse número não está entre 20e90");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
