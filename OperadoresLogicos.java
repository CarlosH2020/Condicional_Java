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
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int res = 1;
        String nome;
        Scanner leitor = new Scanner(System.in);
        while (res == 1) {
            System.out.print("Digite Seu nome:");
            nome = leitor.next();
            
            System.out.println("\n");
            
            System.out.println("Alterar nome [1] ou só sair [2]");
            res = leitor.nextInt();
            
            if(res !=1){
                System.out.printf("O nome %s não foi alterado",nome);
                
            }else{
                System.out.printf("Alterar o nome %s",nome);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
