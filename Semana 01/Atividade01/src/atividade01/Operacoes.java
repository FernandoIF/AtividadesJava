package atividade01;

import java.util.Scanner;

public class Operacoes {
    
    int numeroUm;
    int numeroDois;
    
    void numeroEscolhido(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        numeroUm = input.nextInt();
       
        System.out.print("Digite o segundo numero: ");
        numeroDois = input.nextInt();
    }
    
    void menuCalculadora(){
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRACAO");
        System.out.println("3 - MULTIPLICACAO");
        System.out.println("4 - DIVISAO");
        System.out.print("Escolha uma Operacao: ");
    }
    
    float soma(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }
    
    float subtracao(int primeiroNumero, int segundoNumero){
        return primeiroNumero - segundoNumero;
    }
    
    float multiplicacao(int primeiroNumero, int segundoNumero){
        return primeiroNumero * segundoNumero;
    }
    
    float divisao(int primeiroNumero, int segundoNumero){
        return primeiroNumero / segundoNumero;
    }
}
