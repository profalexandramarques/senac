/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author ALEXANDRAELIAMARAMAR
 */
import java.util.Scanner;
public class Calculadora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("== Calculadora ==");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = ler.nextInt();
        System.out.println("Digite outro número: "); 
        int n2 = ler.nextInt();
        System.out.println("Digite a operação (+,-,*,/): "); 
        String op = ler.next();
        if(op.equals("+")){
            int soma = n1 + n2;
            System.out.println("A soma é "+soma);
        }else if(op.equals("-")){
            int sub = n1 - n2;
            System.out.println("A subtração é "+sub);
        }
    }
        
   }
    

