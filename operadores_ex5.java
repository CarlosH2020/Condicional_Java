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
public class operadores_ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        float nota_1, nota_2, nota_3, nota_4, soma;
        System.out.println("Digite suas 4 notas tiradas em física");
        
        // Leitor de notas 
        System.out.print("Nota - 1:");
        nota_1 = leitor.nextFloat();
        System.out.print("Nota - 2:");
        nota_2 = leitor.nextFloat();
        System.out.print("Nota - 3:");
        nota_3 = leitor.nextFloat();
        System.out.print("Nota - 4:");
        nota_4 = leitor.nextFloat();
        System.out.println("");
        
        soma = (nota_1+nota_2+nota_3+nota_4)/4;
        System.out.println(soma);
        
        //Verifica (média ≥ 7,0),(média ≥ 3,5 e < 7,0),(média < 3,5)
        if(soma > 7 || soma == 7){
            System.out.printf("Média:%.1f\n",soma);
            System.out.println("Aprovado");
        }else if(soma >= 3.5 || soma < 7){
            System.out.printf("Média:%.1f\n",soma);
            System.out.println("Recuperação");  
        }else if(soma < 3.5){
            System.out.printf("Média:%.1f\n",soma);
            System.out.println("Reprovado"); 
        }
        
    }
    
}
