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
public class operadores_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        
        System.out.print("Idade do nadador:");
        idade = leitor.nextInt();
        System.out.print("\n");
        
        if(idade >= 5 && idade <= 10){
            System.out.println("Você se encaixa na cotegoria (Infantil)");
        }else if(idade >= 11 && idade <= 17){
            System.out.println("Você se encaixa na cotegoria (Juvenil)");
        }else if(idade >= 18){
            System.out.println("Você se encaixa na cotegoria (Adulta)");
        }else{
            System.out.println("Você ainda não está preparado para participar");
        }
        
        
        
        
        
    }
    
}
