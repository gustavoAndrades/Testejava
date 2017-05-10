/*testando novo13
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

/**
 *
 * @author Gustavo Andrades
 */
import java.util.Scanner;

public class Calc {
    public static void main (String args[]){
        //declarando as varíaveis
        int opcao;
        int num1 = 0;
        int num2 = 0;
        int result;
        opcao = menu();
        //jj
                            
switch (opcao) {
    case 1:
        result = soma(num1,num2);
       break;
    case 2:
        result = subtracao(num1,num2);
       break;
    case 3:
        result = divisao(num1,num2);
        break;
    case 4:
        result = multiplicacao(num1,num2);
        break;
    case 5:
         break;
    case 6:
        System.out.println("Digite uma opição valida.");
        default;
    }
 }
        //Declaração das Classes
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtracao(int num1, int num2){
		return num1 - num2;
	}
	public static int divisao(int num1,int num2){
		return num1 / num2;
	}
	public static int multiplicacao(int num1, int num2){
		return num1 - num2;
	}
        public static int menu(){
                  //Scanner input = new Scanner(System.in);  
                Scanner in = new Scanner(System.in);                

                  System.out.println("/////////Escolha uma opção\\\\\\\\\\\\");
    System.out.println("1- Soma");  
    System.out.println("2- Subtracao");  
    System.out.println("3- Multiplicacao");  
    System.out.println("4- Divisao");  
    System.out.println("0- Sair");  
    System.out.println("Operação: ");  
    int opcao = in.nextInt();
    return opcao;
}
