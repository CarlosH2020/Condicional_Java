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
public class operadores_ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int v1, v2, v3;
        System.out.println("Digite 1 valor para cada lado de um triângulo.\n");
        
        System.out.print("Primeiro valor:");
        v1 = leitor.nextInt();
        System.out.print("\n");
        System.out.print("Segundo valor:");
        v2 = leitor.nextInt();
        System.out.print("\n");
        System.out.print("Terceiro valor:");
        v3 = leitor.nextInt();
        
        if(v1 == v2 && v1 == v3){
            System.out.print("O triângulo é equilátero.");
        }else if(v1==v2 || v1==v3 || v2==v3){
            System.out.print("O triângulo é isósceles.");
        }else if(v1!=v2 && v2!=v3){
            System.out.print("O triângulo é escaleno.\n");
        }
        
        
        
    }
    
}
