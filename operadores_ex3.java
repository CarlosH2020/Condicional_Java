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
public class operadores_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        double s_valor;
        int num = 15;
        int num2 = 7;
        double s_conta, s_salario;
        
        
        System.out.print("Digite seu salário:");
        s_valor = leitor.nextFloat();
        System.out.print("\n");
        
        if( s_valor >= 0 && s_valor <=1000){
            s_conta = num*s_valor/100;
            s_salario = s_valor + s_conta;
            
            System.out.println("Almento percentual de 15%");
            System.out.printf("Novo salário:R$%.2f\n",s_salario);   
        }else if(s_valor >= 1000.01 && s_valor <= 2500.00){
            s_conta = num2*s_valor/100;
            s_salario = s_valor + s_conta;
            
            System.out.println("Almento percentual de 7%");
            System.out.printf("Novo salário:R$%.2f\n",s_salario);
        }else{
            System.out.println("Acima de 2.500,00R$ não tem aumento");
        }
        
        
    }
    
}
